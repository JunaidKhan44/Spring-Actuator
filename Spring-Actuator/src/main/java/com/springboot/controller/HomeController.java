/**
 * 
 */
package com.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.helper.Student;

/**
 * @author hp
 *
 */
@RestController
public class HomeController {

	
	@Autowired
	private Student student;
	
	@GetMapping("/get-data")
	public  Map<String,String> getData(){
		
		return Map.of("Name","Junaid Khan");
	}
}
