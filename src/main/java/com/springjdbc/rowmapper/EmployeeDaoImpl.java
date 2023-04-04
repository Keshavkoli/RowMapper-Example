package com.springjdbc.rowmapper;

import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public Employee findById(int employeeId) {

		Employee employee = (Employee) getTemplate().queryForObject("SELECT * FROM Employee_tbl WHERE EMPLOYEE_ID=?",
				new Object[] { employeeId }, new EmployeeRowMapper());
		System.out.println("EmployeeDaoImpl.findById():employee:==>" + employee);
		return employee;
	}

	public Collection<Employee> findAll() {

		List<Employee> employeeslist = getTemplate().query("SELECT * FROM Employee_tbl", new EmployeeRowMapper());
		System.out.println("EmployeeDaoImpl.findAll():employeeslist:==>" + employeeslist);
		return employeeslist;
	}
}
