package lab2;

import java.util.concurrent.ArrayBlockingQueue;

public class Queue {
	
	static ArrayBlockingQueue<String> queue;
	
	private static Runnable worker =  new Runnable() {

		@Override
		public void run() {
			// run indefinitely 
			while (true) {
				try {
					System.out.println("Taking from the queue... " + queue.take());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.printf("Error :: ", e.toString());
				}
			}
		}
		
	};
	
	public static void main(String[] args) throws InterruptedException {
		/**
		 * Collections 
		 * Array Socket[]
		 * Lists ArrayList<Socket>
		 * Maps/Dictionaries Map<Integer, Socket>
		 * Queues, Stacks
		 */
		
		System.out.println("Starting the queue...\n");
		
		// 10 is the capacity of queue size 
		queue = new ArrayBlockingQueue<String>(50);
		
		// spinning up two threads
		for (int i=0; i < 2; i++) {
			new Thread(worker).start();
		}
		
		// looping through the queue 100 times
		for (int i=0; i < 200; i++) {
			queue.put(String.format("S%d", i));
		}
		
//		queue.put("S1");
//		queue.put("S2");
//		queue.put("S3");
//		queue.put("S4");
//		queue.put("S5");
//		
//		System.out.println(queue.take());
//		
//		queue.put("S6");

		// This will be outputted when the queue is full
		System.out.println("Queue full....");
		
	}

}
