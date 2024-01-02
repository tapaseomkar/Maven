package com.yash.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.protocol.Resultset;
import com.yash.model.Employee;

public class EmpDao 
{
	JdbcTemplate templates;

	public void setTemplates(JdbcTemplate templates) {
		this.templates = templates;
	}
	
	public int save(Employee emp)
	{
		String ss="insert into Employee(id,name,salary)values(?,?,?)";
		int update=templates.update(ss,emp.getId(),emp.getName(),emp.getSalary());
		return update;	 
	}
	

	
	
	public List<Employee> getEmployees(){  
	    return templates.query("select * from employee",new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	             
	            Employee ee1=new Employee();
	    		ee1.setId(rs.getInt(1));
	    		ee1.setName(rs.getString(2));
	    		ee1.setSalary(rs.getInt(3));
	    		return ee1; 
	        }  
	    });  
	} 
	
	public int delete(int id)
	{
		String qq1="delete from employee where id="+id+"";
		return templates.update(qq1);	
	}
	
	public Employee getEmpById(int id){  
	    String sql="select * from employee where id=?"; 
	    return templates.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));    
	}  
	
	
	
	public int update(Employee ee)
	{
//		String qq2="update employee set name='"+ee.getName()+"', salary="+ee.getSalary()+" where id="+ee.getId()+""; 
//		return templates.update(qq2);
		
//		
		return templates.update("update employee set name = ?, salary = ? where id = ?", new Object[] {ee.getName(), ee.getSalary(), ee.getId()});
		
		
	}
	
	


	
}