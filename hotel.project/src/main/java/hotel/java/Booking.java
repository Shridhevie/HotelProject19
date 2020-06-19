package hotel.java;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sridevi
 *
 */
@Entity
@Table(name = "BOOKING")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BOOKING_ID")
	private int bookingId;
	@Column(name = "ROOM_ID")
	private int roomId;
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	@Column(name = "BREAKFAST")
	private String breakfast;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "TOTAL_CHARGE")
	private double totalCharge;

	public Booking() {
	}

	/**
	 * @param bookingId
	 * @param roomId
	 * @param customerId
	 * @param breakfast
	 * @param startdate
	 * @param enddate
	 * @param totalCharge
	 */
	public Booking(int bookingId, int roomId, int customerId, String breakfast, Date startDate, Date endDate,
			double totalCharge) {
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.breakfast = breakfast;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalCharge = totalCharge;
	}

	/**
	 * @return bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId to set
	 *            
	 */
	public void setBookingId(int bookingId) {
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
	 *           
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	/**
	 * @return customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId to set
	 *            
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return breakfast
	 */
	public String getBreakfast() {
		return breakfast;
	}

	/**
	 * @param breakfast to set
	 *            
	 */
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	/**
	 * @return startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate to set
	 *           
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return endDate
	 */
	public Date getEnddate() {
		return endDate;
	}

	/**
	 * @param endDate to set
	 *           
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return totalCharge
	 */
	public double getTotalCharge() {
		return totalCharge;
	}

	/**
	 * @param totalCharge to set
	 *            
	 */
	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}
    
	/**
	 * @param startDate to set
	 *            
	 */
	public void setStartDate(String strDate) {
		// TODO Auto-generated method stub

	}
	/**
	 * @param endDate to set
	 *            
	 */
	public void setEndDate(String enddDate) {
		// TODO Auto-generated method stub

	}

}

