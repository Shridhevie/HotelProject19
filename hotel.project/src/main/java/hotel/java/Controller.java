package hotel.java;

import org.apache.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Sridevi
 *
 */
@RestController
public class Controller {

  @Autowired
  BookingRepo bookingRepo;

  @Autowired
  CustomerRepo customerRepo;

  @Autowired
  RoomRepo roomRepo;

 Service service=new Service();

/**
 * to save and add customer details
 * @return ResponseEntity<?>
 * @param  AddCustomer Requests addCustomerRequests
 */
@RequestMapping("/Customer")
@ResponseBody
public ResponseEntity<?> addCustomerDetails(@RequestBody AddCustomerRequests addCustomerRequests) 
{
Customer customer=new Customer();
customer.setCustomerId(addCustomerRequests.getCustomerId());
customer.setCustomerName(addCustomerRequests.getCustomerName());

if(service.saveCustomerDetails(addCustomerRequests)!=null)
{
  return new ResponseEntity("Customer Found", HttpStatus.OK);
}
else
  return new  ResponseEntity<>(HttpStatus.NOT_FOUND, "Customer Not Found");
}

/**
 * availability of rooms
 * @param FindAvailableRoomsRequests findAvailableRoomsRequests
 * @return availableRooms
 */
@RequestMapping("/Room")
public FindAvailableRoomsResponse returnAvailableRooms(@RequestBody FindAvailableRoomsRequests findAvailableRoomsRequests) 
{
  FindAvailableRoomsResponse availableRooms=service.getAvailableRooms(findAvailableRoomsRequests);
  return availableRooms;
}

/**
 * to check bill and booking
 * @param  BillingAndBookingRequests billingAndBookingRequests
 * @return Booking 
 */
@RequestMapping("/Booking")
public BillingAndBookingResponse calculateBill(@RequestBody BillingAndBookingRequests billingAndBookingRequests) 
{
 return service.billingAndBooking(billingAndBookingRequests);
}

                  
/**
 * delete booking
 * @param bookingId
 */
@DeleteMapping("/Booking/{bookingId}")
void deleteBooking(@PathVariable int bookingId) {
  service.cancelBooking(bookingId);
}
}