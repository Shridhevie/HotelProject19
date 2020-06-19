package hotel.java;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sridevi
 *
 */
public class BillingAndBookingResponse {
//bookingId
@JsonProperty("bookingId")
 private int bookingId;
//roomId
@JsonProperty("roomId")
 private int roomId;
//customerId
@JsonProperty("customerId")
 private int customerId;
//breakfast
@JsonProperty("breakfast")
 private String breakfast;
//totalCharge
@JsonProperty("totalCharge")
 private double totalCharge;
//startDate
@JsonProperty("startDate")
  private Date startDate;
//endDate
@JsonProperty("endDate")
  private Date endDate;
		
public BillingAndBookingResponse() {}
/**
 * @param bookingId
 * @param roomId
 * @param customerId
 * @param breakfast
 * @param totalCharge
 * @param startDate
 * @param endDate
 */
public BillingAndBookingResponse(int bookingId, int roomId, int customerId, String breakfast, double totalCharge, Date startDate, Date endDate) {
    this.bookingId=bookingId;
    this.roomId=roomId;               
    this.customerId=customerId;
    this.breakfast=breakfast;
    this.totalCharge=totalCharge;
    this.startDate=startDate;
    this.endDate=endDate;
}

/**
 * @return bookingId
 */
public int getBookingId() 
{
  return bookingId;
}
/**
 * @param bookingId to set
 */
public void setBookingId(int bookingId)
{
  this.bookingId=bookingId;
}

/**
 * @return roomId
 */
public int getRoomId()
{
  return roomId;
}
 /**
 * @param roomId to set
 */
public void setRoomId(int roomId)
{
  this.roomId=roomId;
}

/**
 * @return customerId
 */
public int getCustomerId()
{
  return customerId;
}    
 /**
 * @param customerId to set
 */
public void setCustomerId(int customerId)
{
  this.customerId=customerId;
}

/**
 * @return breakfast
 */ 
public String getBreakfast() 
{
  return breakfast;
} 
/**
 * @param breakfast to set
 */
public void setBreakfast(String breakfast)
{
  this.breakfast=breakfast;
}

/**
 * @return totalCharge 
 */
public double getTotalCharge() 
{
  return totalCharge;
} 

/**
 * @param totalCharge to set
 */
public void setTotalcharge(double totalCharge)
{
	this.totalCharge=totalCharge;
}

/**
 * @return startDate
 */
public Date getStartDate() 
{
  return startDate;
} 
/**
 * @param startDate to set
 */
public void setStartDate(Date startDate)
{
  this.startDate=startDate;
}

/**
 * @return endDate
 */
public Date getEndDate() 
{
  return endDate;
} 
/**
 * @param endDate to set
 */
public void setEndDate(Date endDate)
{
  this.endDate=endDate;
}
}

