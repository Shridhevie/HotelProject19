package hotel.java;

import java.util.Date;

/**
 * @author Sridevi
 *
 */
public class BillingAndBookingRequests{
   private int customerId;
   private int roomId;
   private String breakfast;
   private Date startDate;
   private Date endDate;
   
  
   
public BillingAndBookingRequests() {}

/**
 * @param customerId
 * @param roomId
 * @param breakfast
 * @param startDate
 * @param endDate
 */
public  BillingAndBookingRequests(int customerId, int roomId, String breakfast, Date startDate, Date endDate)
{
   this.customerId=customerId;
   this.roomId=roomId;
   this.breakfast=breakfast;
   this.startDate=startDate;
   this.endDate=endDate;
}

public int getCustomerId()
{
  return customerId;
}
public void setCustomerId(int customerId)
{
   this.customerId=customerId;
}

public int getRoomId()
{
   return roomId;
}
public void setRoomId(int roomId)
{
   this.roomId=roomId;
}

public String getBreakfast()
{
   return breakfast;
}
public void setBreakfast(String breakfast)
{
    this.breakfast=breakfast;
}

public Date getStartDate()
{
  return startDate;
}    
public void setStartDate(Date startDate) 
{
  this.startDate=startDate;
}

public Date getEndDate()
{
  return endDate;
}  
 public void setEndDate(Date endDate)
{
  this.endDate=endDate;
}
}
   