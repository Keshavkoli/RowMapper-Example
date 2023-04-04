package com.springjdbc.rowmapper;

import java.util.Collection;

public interface EmployeeDao {

	Employee findById(int i);

	Collection<Employee> findAll();

}
