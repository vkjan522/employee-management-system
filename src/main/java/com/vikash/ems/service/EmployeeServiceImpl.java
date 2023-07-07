package com.vikash.ems.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.ems.dto.EmployeeDTO;
import com.vikash.ems.entity.Employee;
import com.vikash.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		return employeeRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
	}

	private EmployeeDTO convertEntityToDto(Employee employee) {

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setUserId(employee.getID());
		employeeDTO.setFirstName(employee.getFirstname());
		employeeDTO.setLastName(employee.getLastname());
		employeeDTO.setEmployeeEmail(employee.getEmail());
		return employeeDTO;
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

}
