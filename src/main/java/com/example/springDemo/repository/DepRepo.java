package com.example.springDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDemo.entity.Department;

@Repository
public interface DepRepo extends JpaRepository<Department, Long> {

}
