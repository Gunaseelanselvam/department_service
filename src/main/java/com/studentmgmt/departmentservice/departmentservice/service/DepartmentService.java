package com.studentmgmt.departmentservice.departmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentmgmt.departmentservice.departmentservice.entity.Department;
import com.studentmgmt.departmentservice.departmentservice.repository.DeparmentRepository;

@Service
public class DepartmentService {

    private final DeparmentRepository deparmentRespository;

    public DepartmentService(DeparmentRepository deparmentRepository){
        this.deparmentRespository = deparmentRepository;
    }


    public Department createDepartment(Department department){
        return deparmentRespository.save(department);
    }

    public List<Department> getAllDepartments(){
        return deparmentRespository.findAll();
    }

    public Department getDepartmentById(Long id){
        return deparmentRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found"));
    }

    
}
