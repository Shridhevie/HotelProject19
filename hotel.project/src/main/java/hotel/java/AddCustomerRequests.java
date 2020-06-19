package hotel.java;


/**
 * @author Sridevi
 *
 */
public class AddCustomerRequests{
   private int customerId;
   private String customerName; 
   
public AddCustomerRequests() {}
/**
 * @param customerId
 * @param customerName
 */
public AddCustomerRequests(int customerId, String customerName)
{
   this.customerId=customerId;
   this.customerName=customerName;
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
 * @return customerName
 */
public String getCustomerName()
{
return customerName;
}
/**
 * @param customerName to set
 */
public void setCustomerName(String customerName)
{
this.customerName=customerName;
}
}
