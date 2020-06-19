package hotel.java;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Sridevi
 *
 */
public class FindAvailableRoomsResponse {

// findAvailableRoomsResponse
@JsonProperty("findAvailableRoomsResponse")
private List<Room> findAvailableRoomsResponse;
// roomResponse
@JsonProperty("roomResponse")
private List<Room> roomResponse;

public FindAvailableRoomsResponse() {}
/**
 * @param findAvailableRoomsResponse
 * @param roomResponse
 */
public FindAvailableRoomsResponse(List<Room> findAvailableRoomsResponse, List<Room> roomResponse) {
 this.findAvailableRoomsResponse = findAvailableRoomsResponse;
 this.roomResponse=roomResponse;
 }

/**
 * @return findAvailabaleRoomsResponse
 */
public List<Room> getFindAvailableRoomsResponse() {
	return findAvailableRoomsResponse;
}

/**
 * @param findAvailableRoomsResponse to set
 */
public void setFindAvailableRoomsResponse(List<Room> findAvailableRoomsResponse) {
 this.findAvailableRoomsResponse = findAvailableRoomsResponse;
}

/**
 * @param roomResponse to set
 */
public void setRoomResponse(List<Room> roomResponse) {
   this.roomResponse = roomResponse;	    
}
/**
 * @return roomResponse
 */
public List<Room> getRoomResponse() {
  return roomResponse;
}
}
