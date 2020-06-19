package hotel.java;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * @author Sridevi
 *
 */
@Entity
@Table(name="ROOM")
public class Room{
 
@Column(name="ROOM_ID")
    private int roomId;
@Column(name="ROOM_TYPE")
    private String roomType;
@Column(name="ROOM_PRICE")
    private double roomPrice;
@Column(name="STATUS")
    private String status;
@Column(name="BOOKING_ID")
    private int bookingId;

public Room(){}

/**
 * @param roomId
 * @param roomType
 * @param roomPrice
 * @param status
 * @param bookingId
 */
public Room(int roomId, String roomType, double roomPrice, String status, int bookingId) {
	super();
	this.roomId = roomId;
	this.roomType = roomType;
	this.roomPrice = roomPrice;
	this.status = status;
	this.bookingId = bookingId;
}

/**
 * @return roomId
 */
public int getRoomId() {
	return roomId;
}

/**
 * @param roomId to set
 */
public void setRoomId(int roomId) {
	this.roomId = roomId;
}

/**
 * @return roomType
 */
public String getRoomType() {
	return roomType;
}

/**
 * @param roomType to set
 */
public void setRoomType(String roomType) {
	this.roomType = roomType;
}

/**
 * @return roomPrice
 */
public double getRoomPrice() {
	return roomPrice;
}

/**
 * @param roomPrice to set
 */
public void setRoomPrice(double roomPrice) {
	this.roomPrice = roomPrice;
}

/**
 * @return status
 */
public String getStatus() {
	return status;
}

/**
 * @param status to set
 */
public void setStatus(String status) {
	this.status = status;
}
/**
 * @return bookingId
 */
public int getBookingId() {
	return bookingId;
}

/**
 * @param bookingId to set
 */

public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}

}

