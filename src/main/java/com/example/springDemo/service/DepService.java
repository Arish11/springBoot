package com.example.springDemo.service;

import java.util.List;

import com.example.springDemo.entity.Department;

public interface DepService {

	public Department saveDepartment(Department department);

	public List<Department> getDepList();

	public Department getDepListById(Long id);

	public void delDepByID(Long id);

	public Department updateDepById(Long id, Department dep);

}
