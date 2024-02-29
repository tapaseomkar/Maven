package com.yash.springJdbcCurdOp;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDao 
{
	
	private JdbcTemplate objJdbc;
	public void setObjJdbc(JdbcTemplate objJdbc) 
	{
		this.objJdbc = objJdbc;
	}

	
	public int insert(Customer l1)
	{
		String q= "insert into Customer values('"+l1.getCustomerId()+"','"+l1.getCustomerName()+"','"+l1.getCustomerLastName()+"','"+l1.getCustomerNumber()+"','"+l1.getCustomerCity()+"')"; 
		
		return objJdbc.update(q);	
	}
	
	public int update(Customer l1)
	{
		String q="update customer set customername='"+l1.getCustomerName()+"',customerlastname='"+l1.getCustomerLastName()+"'where customerid='"+l1.getCustomerId()+"'";
		return objJdbc.update(q);
	}
	
	
	public int delete(Customer l1)
	{
		String q="delete from customer where customerid=?";
		int update=objJdbc.update(q,l1.getCustomerId());
		return update;
		
	}
	
	public Customer getCustomer(int custid)
	{
		String q="select * from customer where customerid=?";
		RowMapper<Customer>rm=new rowmap();
		Customer cs=objJdbc.queryForObject(q, rm,custid);
		return cs;
	}

}
