package test.java;


import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import hotel.java.AddCustomerRequests;
import hotel.java.Controller;
import hotel.java.Service;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

/**
 * @author Sridevi
 *
 */
public class ControllerTests {
	
	@InjectMocks
	Controller controller = new Controller();
	@Mock
	Service service;
	
	
	
	/**
	 * test method to test addCustomerDetails method
	 * 
	 */
	@Test
	public void addCustomerDetailsTest() {
		String uri = "/Customer";
		MvcResult mvcResult;
		when(service.saveCustomerDetails(addCustomerRequests)).thenReturn(customer);
		try {
			mvcResult = MockMvc.perform(MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON)
					.content(JsonToPojoConverter.convertToJson(addCustomerRequests))).andReturn();

			assertEquals(HttpStatus.OK.value(), mvcResult.getResponse().getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
		verify(service).saveCustomerDetails(addCustomerRequests);
	}
}
