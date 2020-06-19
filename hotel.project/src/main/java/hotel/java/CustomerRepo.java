package hotel.java;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hotel.java.Customer;

/**
 * @author Sridevi
 *
 */
@Repository
public interface CustomerRepo<integer> extends CrudRepository<Customer, integer> {
	
}
