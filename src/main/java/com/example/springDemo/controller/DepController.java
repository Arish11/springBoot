package com.example.springDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springDemo.entity.Department;
import com.example.springDemo.service.DepService;

@RestController
public class DepController {
	@Autowired
	private DepService service;
	
	@PostMapping("/save")
	public Department saveDep(@RequestBody Department department) {
		return service.saveDepartment(department);
	}
	
	@GetMapping("/getAll")
	public List<Department> depList(){
		return service.getDepList();
	}
	
	@GetMapping("/getById")
	public Department depListById(@RequestBody Long id){
		return service.getDepListById(id);
	}
}
