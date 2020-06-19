package hotel.java;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sridevi
 *
 */
public class Service {

@Autowired
private BookingRepo bookingRepo;

@Autowired
private CustomerRepo customerRepo;

@Autowired
private RoomRepo roomRepo;

int i;


/**
 * to save customer details
 * @param customer
 * @return saveCustomerDetails
 */
public Customer saveCustomerDetails(AddCustomerRequests addCustomerRequests)
{
  Customer saveCustomerDetails=(Customer) customerRepo.save(addCustomerRequests.getCustomerId());
  return saveCustomerDetails;
}


/**
 * to check availability of rooms by date/date range
 * @param findAvailableRoomsRequests
 * @return findAvailableRooms
 */
public FindAvailableRoomsResponse getAvailableRooms(FindAvailableRoomsRequests  findAvailableRoomsRequests)
{
	FindAvailableRoomsResponse findAvailableRoomsResponse=new FindAvailableRoomsResponse();
	
	findAvailableRoomsResponse.setFindAvailableRoomsResponse(roomRepo.findAvailableRooms(findAvailableRoomsRequests.getStartDate(), findAvailableRoomsRequests.getEndDate()));
	return findAvailableRoomsResponse;
	
}

/** 
 * to create billing and booking
 * @param billingAndBookingRequests
 * @return  BillingAndBookingResponse billingAndBookingResponse
 */
public BillingAndBookingResponse billingAndBooking(BillingAndBookingRequests billingAndBookingRequests)
{
  double breakfastCharge = 1000;
  double bill = 0.0;
  String y="YES";
  String n="NO";
  
  Booking booking=new Booking();
  BillingAndBookingResponse billingAndBookingResponse=new BillingAndBookingResponse(); 
  FindAvailableRoomsRequests findAvailableRoomsRequests = null;
  List<Room> availableRooms= (List<Room>) getAvailableRooms(findAvailableRoomsRequests);
  int flag=0;
  Room room=null;
  for(i=0; i<availableRooms.size(); i++)
  {
	  if(availableRooms.get(i).getRoomId()==billingAndBookingRequests.getRoomId())
	  {
		  room=availableRooms.get(i);
				  flag=1;
				  break;
	  }
  }
  
  if(flag==1) {
  if(billingAndBookingRequests.getBreakfast().equals(y))
  {
	  bill = room.getRoomPrice() + breakfastCharge;
  }
  else
  {
	  bill = room.getRoomPrice();
  }
 
  booking.setCustomerId(billingAndBookingRequests.getCustomerId());
  booking.setRoomId(billingAndBookingRequests.getRoomId());
  booking.setBreakfast(billingAndBookingRequests.getBreakfast());
  booking.setTotalCharge(bill);
  booking.setStartDate(billingAndBookingRequests.getStartDate());
  booking.setEndDate(billingAndBookingRequests.getEndDate());
  
  if(bookingRepo.save(booking)!=null) {
	  
  billingAndBookingResponse.setCustomerId(booking.getCustomerId());
  billingAndBookingResponse.setRoomId(booking.getRoomId());
  billingAndBookingResponse.setBookingId(booking.getBookingId());
  billingAndBookingResponse.setBreakfast(booking.getBreakfast());
  billingAndBookingResponse.setTotalcharge(booking.getTotalCharge());
  
 
}

  }
  return billingAndBookingResponse;
  
  
}
  
 
 /**
 * cancel booking
 * @param bookingId
 */
public void cancelBooking(int bookingId)
  {
	  bookingRepo.deleteById(bookingId);
  }
}



