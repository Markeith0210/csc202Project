package project.model;

import java.util.Date;

public class Lease {
	public Date Start;
	public Date End;
	public String room;
	public Double rentAmount;
	
	public Lease(Date start, Date end, String room, Double rentAmount) {
		super();
		Start = start;
		End = end;
		this.room = room;
		this.rentAmount = rentAmount;
	}
	public Date getStart() {
		return Start;
	}
	public void setStart(Date start) {
		Start = start;
	}
	public Date getEnd() {
		return End;
	}
	public void setEnd(Date end) {
		End = end;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Double getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(Double rentAmount) {
		this.rentAmount = rentAmount;
	}
}
