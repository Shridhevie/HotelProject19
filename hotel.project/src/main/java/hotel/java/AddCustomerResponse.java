package hotel.java;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sridevi
 *
 */
public class AddCustomerResponse {
	//customerId
	@JsonProperty("customerId")
	private int customerId;
	
	//customerName
	@JsonProperty("customerName")
	private String customerName;
	

public  AddCustomerResponse () {}
/**
 * @param customerId
 * @param customerName
 */
public  AddCustomerResponse(int customerId, String customerName)
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
 * 
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
 * 
 */
public void setCustomerName(String customerName)
{
this.customerName=customerName;
}
}

