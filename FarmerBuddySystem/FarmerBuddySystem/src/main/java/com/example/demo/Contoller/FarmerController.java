package com.example.demo.Contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Farmer;
import com.example.demo.Service.FarmerService;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {
	
	private FarmerService farmerService;

	public FarmerController(FarmerService farmerService) {
		super();
		this.farmerService = farmerService;
	}
	
	// build create farmer REST API
	@PostMapping()
	public ResponseEntity<Farmer> saveFarmer(@RequestBody Farmer farmer){
		return new ResponseEntity<Farmer>(farmerService.saveFarmer(farmer), HttpStatus.CREATED);
						
	}
}
