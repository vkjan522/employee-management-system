package com.vikash.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.vikash.ems.entity.Employee;
import com.vikash.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

//	 displaying all Employee
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("listEmployee", employeeService.getAllEmployee());
		return "home";
	}

	// add new employee
	@GetMapping("/shownewemployeeform")
	public String shownewemployeeform(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";

	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/home";
		
	}
}
