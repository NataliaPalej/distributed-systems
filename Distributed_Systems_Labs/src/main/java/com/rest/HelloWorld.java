package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *  To ensure that the methods work, we need to add @Path annotation
 *  Server Definition: http://localhost:8080/Distributed_Systems_Labs/rest/*
 *  Endpoint: http://localhost:8080/Distributed_Systems_Labs/rest/hello
 *  
 */
@Path("/hello")
public class HelloWorld {
	
	/**
	 * Annotatoin must be added to each method so the server knows how to interact with client
	 * @GET - http://localhost:8080/Distributed_Systems_Labs/rest/hello
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloPlainGreeting() {
		return "helloPainGreeting :: Hello Jersey, how are you doing?";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String helloXMLGreeting() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><greeting>\r\n"
				+ "<to>Students</to>\r\n"
				+ "<from>Jersey</from>\r\n"
				+ "<body>helloXMLGreeting :: Hi There!</body>\r\n"
				+ "</greeting>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String helloJSON() {
		return "{\"to\":\"Students\", \"message\":\"helloJSON :: Hi there, how are you?\"}";
	}
	
}
