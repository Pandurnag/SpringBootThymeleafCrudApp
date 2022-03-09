package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.mdel.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}