package com.training.ers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ers.models.Doctor;
import com.training.ers.security.services.DoctorService;


@RestController
@RequestMapping("doctors")
@CrossOrigin(origins = "http://localhost:8081")
public class DoctorController {

	@Autowired
	DoctorService doctorService;

	@GetMapping
	public ResponseEntity<List<Doctor>> getDoctors() { // LOCALHOST:5050/Doctor -GET
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> result = null;
		if (doctorService.getDoctors().equals(null)) {
			result = doctorService.getDoctors();
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.NO_CONTENT);
		} else {
			result = doctorService.getDoctors();
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("/searchDoctorBySLI/{insurance_Excepted}/{location_city}/{location_state}/{specialty}")
	public ResponseEntity<List<Doctor>> getDoctorNameBySLI(@PathVariable("insurance_Excepted") String insexec,
			@PathVariable("location_city") String loccity, @PathVariable("location_state") String locstate,
			@PathVariable("specialty") String spec) { // localhost:5050/product/Bottle
		List<Doctor> result = doctorService.getDoctorBySLI(insexec, loccity, locstate, spec);
		ResponseEntity<List<Doctor>> responseEntity = null;
		if (result.size() == 0) {
			responseEntity = new ResponseEntity<List<Doctor>>(HttpStatus.NO_CONTENT);
		} else {
			// result = doctorService.getDoctorBySLI(spec, loccity, locstate, insexec);
			responseEntity = new ResponseEntity<List<Doctor>>(HttpStatus.OK);
		}
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) { // localhost:5050/Doctor -POST

		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (doctorService.doesDoctorExists(doctor.getDoctorId())) {
			result = "Doctor with Doctor id :" + doctor.getDoctorId() + " already exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK); // 200 }
		} else {
			result = doctorService.addDoctor(doctor);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.CREATED);// 201 }

		}
		return responseEntity;
	}

	@PutMapping("{doctorId}")
	public ResponseEntity<String> updateProduct(@PathVariable("doctorId") int doctorId, @RequestBody Doctor doctor) { /// localhost:5050/product
																														/// -Put
		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (doctorService.doesDoctorExists(doctor.getDoctorId())) {
			result = doctorService.updateDoctor(doctorId, doctor);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK);
		} else {
			result = "Doctor with Id :" + doctor.getDoctorId() + "does not exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.NOT_MODIFIED);
		}
		return responseEntity;
	}

	@GetMapping("searchDoctorByName/{doctorName}")
	public ResponseEntity<List<Doctor>> getDoctorByDoctorName(@PathVariable("doctorName") String doctorName) { // localhost:5050/product/Bottle
		List<Doctor> result = doctorService.getDoctorByName(doctorName);
		ResponseEntity<List<Doctor>> responseEntity = null;
		if (result.size() == 0) {
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.NO_CONTENT);
		} else {
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.OK);
		}
		return responseEntity;
	}

}
