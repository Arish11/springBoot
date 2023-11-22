package com.example.springDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springDemo.entity.Department;
import com.example.springDemo.repository.DepRepo;

@Service
public class DepServiceImpl implements DepService {

	@Autowired
	private DepRepo repo;
	
	@Override
	public Department saveDepartment(Department department) {
		return repo.save(department);
	}

	@Override
	public List<Department> getDepList() {
		return repo.findAll();
	}

	@Override
	public Department getDepListById(Long id) {
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id!"));
	}

	@Override
	public void delDepByID(Long id) {
		//Department dep = repo.findById(id).get();
		repo.deleteById(id);
	}

}
