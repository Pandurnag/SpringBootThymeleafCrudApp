package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.mdel.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee geEmployeeById(long id);
	void deleteEmployeeById(long id);

}
