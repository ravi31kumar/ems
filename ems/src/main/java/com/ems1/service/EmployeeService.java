package com.ems1.service;


import com.ems1.entities.Employee;
import com.ems1.payload.EmployeeDTO;
import com.ems1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;



    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        Employee employee =new Employee();
        employee.setName(employeeDTO.getName());
        employee.setMobile(employeeDTO.getMobile());
        Employee saveEmployee = employeeRepository.save(employee);

        EmployeeDTO toDTO =new EmployeeDTO();
        toDTO.setName(saveEmployee.getName());
        toDTO.setMobile(saveEmployee.getMobile());
        toDTO.setEid(saveEmployee.getEid());

        return toDTO;


    }

}
