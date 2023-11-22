package com.example.springDemo.service;

import java.util.List;
import java.util.Objects;

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
		repo.deleteById(id);
	}

	@Override
	public Department updateDepById(Long id, Department dep) {
		Department tempDep = repo.findById(id).get();
		if( Objects.nonNull(dep.getDepAddr()) && !dep.getDepAddr().equalsIgnoreCase("")) {
			tempDep.setDepAddr(dep.getDepAddr());
		}
		if(Objects.nonNull(dep.getDepCode()) && !dep.getDepCode().equalsIgnoreCase("") ) {
			tempDep.setDepCode(dep.getDepCode());
		}
		if(Objects.nonNull(dep.getDepName()) && !dep.getDepName().equalsIgnoreCase("") ) {
			tempDep.setDepName(dep.getDepName());
		}	
		return repo.save(tempDep);
	}

}
