package com.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		System.out.println("EmployeeRowMapper.mapRow():emp:==>" + emp);
		emp.setId(rs.getInt("Employee_ID"));
		emp.setName(rs.getString("EMPLOYEE_FULLNAME"));
		emp.setDesignation(rs.getString("EMPLOYEE_DESIGNATION"));
		emp.setSalary(rs.getInt("EMPLOYEE_SALARY"));
		return emp;
	}

}
