package project.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement()
public class Task {
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	//used as map key determined at instance instantiation
	@XmlElement(required=true)
	private Integer taskId;
	@XmlElement(required=true)
	private Integer roomNumber;
	@XmlElement(required=true)
	private String description;
	
	private Date dateSubmitted;

	public Integer getTaskId() {
		return taskId;
	}
	/*
	 * generated, but I don't actually care if user changes
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Date dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}
	
	public Task(Integer taskId, Integer roomNumber, String description,
			Date dateSubmitted) {
		super();
		this.roomNumber = roomNumber;
		this.description = description;
		this.dateSubmitted = dateSubmitted;
		//256 bits of reasonably unique collisions can happen c'est la vie
		this.taskId = taskId.equals(null)||taskId.equals(new Integer(0))?this.hashCode():taskId; 
	}
	
	
}
