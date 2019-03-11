package com.knackportal.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.knackportal.model.EmployeeDetails;


public interface EmployeeDao {
	
	
	public void setDataSource(DataSource dataSource); // used for connection

	public void create(Integer id, String name, String mobilenumber, String address, String department,
			String password, String role);// used for creation of record

	public List<EmployeeDetails> getEmp(String name);// used for getting a record

	public List<EmployeeDetails> listEmp();// used for getting all record

	public void delete(Integer id);// used for deleting a record

	public void update(Integer id, String name, String mobilenumber, String address, String department,
			String password, String role);// used for updating a record

	public EmployeeDetails checkLogin(Integer id, String password);

}
