package com.studentmgmt.departmentservice.departmentservice.controller;


import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmgmt.departmentservice.departmentservice.entity.Department;
import com.studentmgmt.departmentservice.departmentservice.service.DepartmentService;


@RestController
@RequestMapping("/api/departments")
public class DepartmentControler {

    private final DepartmentService departmentService;

    public DepartmentControler(DepartmentService departmentService){
        this.departmentService = departmentService;
    }


    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        Department savedDepartment = departmentService.createDepartment(department);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedDepartment);
    }
    
    

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
        Department department = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(department);
    }

    


}
