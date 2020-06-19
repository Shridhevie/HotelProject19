package hotel.java;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


/**
 * @author Sridevi
 *
 */
@Entity
@Table(name="CUSTOMER")
public class Customer {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="CUSTOMERID")
    private int customerId;

@Column(name="CUSTOMERNAME")
   private String customerName;

public Customer() {}
/**
 * @param customerId
 * @param customerName
 */
public Customer(int customerId, String customerName) 
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

 
@Override
public String toString() 
{
   return "customerId: " + customerId + " customerName: " + customerName;
}

}


