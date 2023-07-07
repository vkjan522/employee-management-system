package com.vikash.ems.service;

import java.util.List;

import com.vikash.ems.dto.EmployeeDTO;
import com.vikash.ems.entity.Employee;

public interface EmployeeService {
	List<EmployeeDTO> getAllEmployee();

	void saveEmployee(Employee employee);

}
