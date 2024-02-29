package com.yash.springJdbcCurdOp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowmap implements RowMapper<Customer>
{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer c=new Customer();
		c.setCustomerId(rs.getInt(1));
		c.setCustomerName(rs.getNString(2));
		c.setCustomerLastName(rs.getNString(3));
		c.setCustomerNumber(rs.getInt(4));
		c.setCustomerCity(rs.getNString(5));
		return c;
	}

}
