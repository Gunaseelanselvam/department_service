package com.studentmgmt.departmentservice.departmentservice.repository;
import org.springframework.stereotype.Repository;

import com.studentmgmt.departmentservice.departmentservice.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface DeparmentRepository extends JpaRepository<Department, Long>{
    
}
