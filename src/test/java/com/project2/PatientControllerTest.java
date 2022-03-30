package com.project2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.project2.model.Patient;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

public class PatientControllerTest extends AbstractTest {
	
	private String uri="/patient";
	private int patientId = 10;
	
	@BeforeEach
	protected void setUp() {
		super.setUp();
	}
	
	// test save function
	@Test
	@Order(1)
	@DisplayName(value = "Testing patient save functionality")
	void testSave() throws Exception {
		//creating an object for saving
		Patient patient = new Patient(patientId, "John", "Cold", "Dr. Drew", "1200", "Terrence Got You Covered");
		//transforming java object into JSON
		String patientJSON = super.mapToJson(patient);
		
		//calling the rest API
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(patientJSON))
				.andReturn();
		
		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();
		
		assertEquals(201, statusCode);
		assertEquals("Patient saved successfully", message);
	}
	//test get a single review function
	@Test
	@Order(2)
	@DisplayName(value = "Testing patient get function")
	void testGet() throws Exception {
		Patient expectedPatient = new Patient(patientId, "John", "Cold", "Dr. Drew", "1200", "Terrence Got You Covered");
		//calling the rest API
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.get(uri+"/"+patientId).contentType(MediaType.APPLICATION_JSON_VALUE))
				.andReturn();
		
		int statusCode = mvcResult.getResponse().getStatus();
		String message = mvcResult.getResponse().getContentAsString();
		Patient actualPatient = super.mapFromJson(message, Patient.class);
		assertEquals(200, statusCode);
		assertEquals(actualPatient, expectedPatient);
	}
	
	// test save function
		@Test
		@Order(3)
		@DisplayName(value = "3. Testing patient update functionality")
		void testUpdate() throws Exception {
			//transforming java object into JSON
			Patient updatedPatient = new Patient(patientId, "John", "Cold", "Dr. Drew", "1200", "Terrence Got You Covered");

			String patientJSON = super.mapToJson(updatedPatient);
			
			//calling the rest API
			MvcResult mvcResult = mvc.perform(
					MockMvcRequestBuilders.put(uri+"/"+patientId).contentType(MediaType.APPLICATION_JSON_VALUE).content(patientJSON))
					.andReturn();
			
			int statusCode = mvcResult.getResponse().getStatus();
			String message = mvcResult.getResponse().getContentAsString();
			
			assertEquals(200, statusCode);
			assertEquals("Patient updated successfully", message);
		}
		
		// test get all functionality
		@Test
		@Order(4)
		@DisplayName("4. Testing get all functionality")
		void testGetAll() throws Exception {

			MvcResult mvcResult = mvc
					.perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.APPLICATION_JSON_VALUE))
					.andReturn();

			int statusCode = mvcResult.getResponse().getStatus();
			String message = mvcResult.getResponse().getContentAsString();
			Patient[] actualreview = super.mapFromJson(message, Patient[].class);

			assertEquals(200, statusCode);
			assertTrue(actualreview.length > 0);

		}

	
	@Test
    @Order(5)
    @DisplayName(value = "Testing patient delete functionality")
    void testDelete() throws Exception {
        //calling the rest api
        MvcResult mvcResult = mvc.perform(
                MockMvcRequestBuilders.delete(uri + "/" + patientId).contentType(MediaType.APPLICATION_JSON_VALUE))
        		.andReturn();
        
        int statusCode = mvcResult.getResponse().getStatus();
        String message = mvcResult.getResponse().getContentAsString();
        
        assertEquals(200, statusCode);
        assertEquals("Patient deleted successfully", message);
    }

}



