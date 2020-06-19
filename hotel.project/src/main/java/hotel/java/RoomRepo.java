package hotel.java;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import hotel.java.Room;

/**
 * @author Sridevi
 *
 */
public interface RoomRepo<integer> extends CrudRepository<Room, integer> {
	 @Query("select * from ROOM r where r.status='Available' AND when BOOKING_ID bId from BOOKING  NOT IN(select bId from Booking where(StartDate BETWEEN 'startDate' AND 'endDate) OR (EndDate BETWEEN 'startDate' AND 'endDate') OR (StartDate >= 'startDate' AND EndDate <= 'endDate')")
	   List<Room> findAvailableRooms(@Param("startDate")Date  StartDate, @Param("endDate") Date EndDate);
	
}
