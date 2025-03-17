package com.ritekraft.catalouge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritekraft.catalouge.service.CatalougeServiceImpl;

@RestController
@RequestMapping("/catalouge")
public class CatalougeController {
	
	@Autowired
	CatalougeServiceImpl catalougeImpl;

}
