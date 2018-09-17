package com.nibi.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.nibi.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
