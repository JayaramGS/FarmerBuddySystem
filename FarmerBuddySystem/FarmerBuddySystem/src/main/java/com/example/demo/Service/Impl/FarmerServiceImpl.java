package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Farmer;
import com.example.demo.Repository.FarmerRepository;
import com.example.demo.Service.FarmerService;

@Service
public class FarmerServiceImpl implements FarmerService{
	
	private FarmerRepository farmerRepository;
	
	public FarmerServiceImpl(FarmerRepository farmerRepository) {
		super();
		this.farmerRepository = farmerRepository;
	}

	@Override
	public Farmer saveFarmer(Farmer farmer) {
		return farmerRepository.save(farmer);
	}
	
}
