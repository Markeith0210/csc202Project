package project.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement()
public class Lease {
	public Date Start;
	public Date End;
	//key mapping to room will be hashmap key, but for now marking it here
	public int roomNumber;
	public Double rentAmount;
	

	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
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
	public int getRoom() {
		return roomNumber;
	}
	public void setRoom(int room) {
		this.roomNumber = room;
	}
	public Double getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(Double rentAmount) {
		this.rentAmount = rentAmount;
	}
}
