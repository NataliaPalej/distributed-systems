package myApp;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Annotations @XmlRootElement and @XmlType are allowing for the communication with module object
 * by automatic binding. It must have default or empty constructor + getters and setters must be defined 
 */

@XmlRootElement(name="module")
// Order in which the data will be placed
@XmlType(propOrder = { "id", "name", "lecturer", "hoursPerWeek" } )
public class Module {
	
	private int id, hoursPerWeek;
	private String name, lecturer;
	
	public Module(int id, String name, String lecturer, int hoursPerWeek) {
		super();
		this.id = id;
		this.name = name;
		this.lecturer = lecturer;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public Module() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLecturer() {
		return lecturer;
	}
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	@Override
	public String toString() {
		return "Module [id=" + id + ", hoursPerWeek=" + hoursPerWeek + ", name=" + name + ", lecturer=" + lecturer
				+ "]";
	}
	
	

}
