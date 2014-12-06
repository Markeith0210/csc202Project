package project.model;

import java.util.Date;

public class Task {
	//used as map key determined at instance instantiation
	private Integer taskId;
	
	private Integer roomNumber;
	
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
