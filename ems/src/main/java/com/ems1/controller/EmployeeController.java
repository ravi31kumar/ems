package com.ems1.controller;


import com.ems1.payload.EmployeeDTO;
import com.ems1.payload.SalaryDTO;
import com.ems1.service.EmployeeService;
import com.ems1.service.SalaryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @Autowired
    private SalaryServices salaryServices;




    //http://localhost:8080/api/employee
    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){

        EmployeeDTO toDTO= employeeService.saveEmployee(employeeDTO);
        return new ResponseEntity<>(toDTO, HttpStatus.CREATED);


    }

    //http://localhost:8080/api/employee/1/salary
    @PostMapping("/{id}/salary")
    public ResponseEntity<SalaryDTO> saveSalary(@PathVariable("id") long id,@RequestBody SalaryDTO salaryDTO ){
        SalaryDTO dto = salaryServices.saveSalary(id, salaryDTO);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }




}
