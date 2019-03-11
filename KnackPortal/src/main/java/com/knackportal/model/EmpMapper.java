package com.knackportal.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<EmployeeDetails>{

	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		EmployeeDetails empDetails = new EmployeeDetails();
		empDetails.setId(rs.getInt("id"));
		empDetails.setName(rs.getString("name"));
		empDetails.setMobilenumber(rs.getString("mobilenumber"));
		empDetails.setAddress(rs.getString("address"));
		empDetails.setDepartment(rs.getString("department"));
		empDetails.setPassword(rs.getString("password"));
		empDetails.setRole(rs.getString("role"));
		return empDetails;
	}

}
