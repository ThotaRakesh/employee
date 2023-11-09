package com.example.employee.model;

import com.example.employee.model.Employee;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Employee(
                resultSet.getInt("employeeId"),
                resultSet.getString("employeeName"),
                resultSet.getString("email"),
                resultSet.getString("department"));

    }
}
