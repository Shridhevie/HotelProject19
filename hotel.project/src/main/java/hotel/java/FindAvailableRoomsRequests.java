package hotel.java;

import java.util.Date;
/**
 * @author Sridevi
 *
 */
public class FindAvailableRoomsRequests {
	private Date startDate;
	private Date endDate;
	
public  FindAvailableRoomsRequests() {}
/**
 * @param startDate
 * @param endDate
 */
public  FindAvailableRoomsRequests(Date startDate, Date endDate)
{
	this.startDate=startDate;
	this.endDate=endDate;
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
 * @return  endDate
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
