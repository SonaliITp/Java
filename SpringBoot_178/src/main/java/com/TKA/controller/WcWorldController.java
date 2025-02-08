package com.TKA.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TKA.entity.WcWorldcup;
import com.TKA.service.WcWorldcupService;
//http://localhost:8080/medicalcount?deptName=medical&age=23
@RestController
public class WcWorldController {
	
	@Autowired
	WcWorldcupService service;
	
	@GetMapping("allIndianstaffcount")
	public int allIndianCricketStaffCount()
	{
	   return service.allIndianCricketStaffCount();
	} 
	
	@GetMapping("medicalcount/{deptName}/{age}")
	public int allIndianCricketMedStaffCount(@PathVariable String deptName,@PathVariable String age)
	{
		System.err.println(deptName);
		System.err.println(age);
	    return service.allIndianCricketMedStaffCount(deptName);	
	}
	
	@GetMapping("medicalcount")
	public int allIndianCricketMedStaffCount1(@RequestParam String deptName,@RequestParam String age)
	{
		System.err.println(deptName);
		System.err.println(age);
	    return service.allIndianCricketMedStaffCount(deptName);	
	}
	
	@GetMapping("nameage")
	public HashMap<String,Integer> fetchIndianCricketNamewithAge()
	{
		return service.fetchIndianCricketNamewithAge();
	}
	@GetMapping("mostexp")
	public WcWorldcup fetchMostwork()
	{
		return service.fetchMostwork();
	}
	
	
	@PostMapping("insertCricket")
	public void insertCricketStaff(@RequestBody WcWorldcup w) {
		System.err.println("cricket staff data from postman...>"+w);
		service.insertCricketStaff(w);
	}
	
	@PutMapping("updateCricket")
	public void updateCricketStaff(@RequestBody WcWorldcup w) {
		System.err.println("cricket staff data from postman...>"+w);
		service.updateCricketStaff(w);
	}
	
	@DeleteMapping("deleteCricket/{id}")
	public void deleteCricketStaff(@PathVariable int id) {
		
		service.deleteCricketStaff(id);
	}
	
	
	}


