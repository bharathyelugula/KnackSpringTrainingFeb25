package com.knackportal.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.knackportal.dao.EmployeeDao;
import com.knackportal.model.EmpMapper;
import com.knackportal.model.EmployeeDetails;

public class EmployeeDaoImpl implements EmployeeDao {

	DataSource dataSource;
	JdbcTemplate empjdbctemplate;

	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.empjdbctemplate = new JdbcTemplate(dataSource);
	}

	public void create(Integer id, String name, String mobilenumber, String address, String department, String password,
			String role) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO employeedetails(id,name,mobilenumber,address,department,password,role) VALUES (?,?,?,?,?,?,?)";
		empjdbctemplate.update(SQL, id, name, mobilenumber, address, department, password, role);

	}

	public List<EmployeeDetails> getEmp(String name) {
		// TODO Auto-generated method stub
		String SQL = "select * from employeedetails WHERE id=? or name=? or role=?";
		List<EmployeeDetails> emp = empjdbctemplate.query(SQL, new Object[] {name,name,name}, new EmpMapper());
		return  emp;
	}

	public List<EmployeeDetails> listEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(Integer id, String name, String mobilenumber, String address, String department, String password,
			String role) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO employeedetails(id,name,mobilenumber,address,department,password,role) VALUES (?,?,?,?,?,?,?)";
		empjdbctemplate.update(SQL, id, name, mobilenumber, address, department, password, role);

	}

	public EmployeeDetails checkLogin(Integer id, String password) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM employeedetails WHERE id=? and password=?";
		EmployeeDetails emp = empjdbctemplate.queryForObject(SQL, new Object[] { id, password }, new EmpMapper());
		return emp;
	}

}
