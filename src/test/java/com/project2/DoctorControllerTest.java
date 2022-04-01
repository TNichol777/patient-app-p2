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

import com.project2.model.Doctor;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

public class DoctorControllerTest extends AbstractTest {

	private String uri = "/doctor";
	private int doctorId = 10;

	@BeforeEach
	protected void setUp() {
		super.setUp();
	}
	
	
	// test Doctor get function
	@Test
	@Order(1)
	@DisplayName(value = "testing doctor get function")
	void testGetDoc() throws Exception {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * // test save function
	 * 
	 * @Test
	 * 
	 * @Order(1)
	 * 
	 * @DisplayName(value = "Testing doctor save functionality") void testSave()
	 * throws Exception { // creating an object for saving Doctor doctor = new
	 * Doctor(doctorId, "Dr. Drew", "Cardiac Surgery", "USA",
	 * "Terrence Got You Covered"); // transforming java object into JSON String
	 * doctorJSON = super.mapToJson(doctor);
	 * 
	 * // calling the rest API MvcResult mvcResult = mvc.perform(
	 * MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE
	 * ).content(doctorJSON)) .andReturn();
	 * 
	 * int statusCode = mvcResult.getResponse().getStatus(); String message =
	 * mvcResult.getResponse().getContentAsString();
	 * 
	 * assertEquals(201, statusCode); assertEquals("Doctor saved successfully",
	 * message); }
	 */

	// test get a single review function

	/*
	 * @Test
	 * 
	 * //@Order(2)
	 * 
	 * @DisplayName(value = "Testing doctor get function") void testGet() throws
	 * Exception { Doctor expectedDoctor = new Doctor(doctorId, "Dr. Drew",
	 * "Cardiac Surgery", "USA", "Terrence Got You Covered"); // calling // API
	 * MvcResult mvcResult = mvc .perform(MockMvcRequestBuilders.get(uri + "/" +
	 * doctorId).contentType(MediaType.APPLICATION_JSON_VALUE)) .andReturn(); int
	 * statusCode = mvcResult.getResponse().getStatus(); String message =
	 * mvcResult.getResponse().getContentAsString(); Doctor actualDoctor =
	 * super.mapFromJson(message, Doctor.class); assertEquals(200, statusCode);
	 * assertEquals(actualDoctor, expectedDoctor); }
	 */

	/*
	 * // test save function
	 * 
	 * @Test
	 * 
	 * @Order(3)
	 * 
	 * @DisplayName(value = "3. Testing doctor update functionality") void
	 * testUpdate() throws Exception { //transforming java object into JSON Doctor
	 * updatedDoctor = new Doctor(doctorId, "Dr. Drew", "Cardiac Surgery", "USA",
	 * "Terrence Got You Covered");
	 * 
	 * String doctorJSON = super.mapToJson(updatedDoctor);
	 * 
	 * //calling the rest API MvcResult mvcResult = mvc.perform(
	 * MockMvcRequestBuilders.put(uri+"/"+doctorId).contentType(MediaType.
	 * APPLICATION_JSON_VALUE).content(doctorJSON)) .andReturn();
	 * 
	 * int statusCode = mvcResult.getResponse().getStatus(); String message =
	 * mvcResult.getResponse().getContentAsString();
	 * 
	 * assertEquals(200, statusCode); assertEquals("Doctor updated successfully",
	 * message); }
	 * 
	 * // test get all functionality
	 * 
	 * @Test
	 * 
	 * @Order(4)
	 * 
	 * @DisplayName("4. Testing get all functionality") void testGetAll() throws
	 * Exception {
	 * 
	 * MvcResult mvcResult = mvc
	 * .perform(MockMvcRequestBuilders.get(uri).contentType(MediaType.
	 * APPLICATION_JSON_VALUE)) .andReturn();
	 * 
	 * int statusCode = mvcResult.getResponse().getStatus(); String message =
	 * mvcResult.getResponse().getContentAsString(); Doctor[] actualreview =
	 * super.mapFromJson(message, Doctor[].class);
	 * 
	 * assertEquals(200, statusCode); assertTrue(actualreview.length > 0);
	 * 
	 * }
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(5)
	 * 
	 * @DisplayName(value = "Testing doctor delete functionality") void testDelete()
	 * throws Exception { //calling the rest api MvcResult mvcResult = mvc.perform(
	 * MockMvcRequestBuilders.delete(uri + "/" +
	 * doctorId).contentType(MediaType.APPLICATION_JSON_VALUE)) .andReturn();
	 * 
	 * int statusCode = mvcResult.getResponse().getStatus(); String message =
	 * mvcResult.getResponse().getContentAsString();
	 * 
	 * assertEquals(200, statusCode); assertEquals("Doctor deleted successfully",
	 * message); }
	 */

}
