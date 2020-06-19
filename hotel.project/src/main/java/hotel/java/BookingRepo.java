package hotel.java;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hotel.java.Booking;

/**
 * @author Sridevi
 *
 */
@Repository
public interface BookingRepo<integer> extends CrudRepository<Booking, integer> {

		void deleteById(int bookingId);

	}

