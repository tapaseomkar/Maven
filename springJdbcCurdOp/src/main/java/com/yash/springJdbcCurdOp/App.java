package com.yash.springJdbcCurdOp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("NewFile.xml");
    	CustomerDao objdao=(CustomerDao) ctx.getBean("customerdao");
    	
    	//insert
//    	Customer cst=new Customer(127, "kuma", "sanket", 55, "mountain");
//    	objdao.insert(cst);
//    	System.out.println("inserted");

    	//update
//    	Customer cst1=new Customer();
//    	cst1.setCustomerId(121);
//    	cst1.setCustomerName("pratham");
//    	cst1.setCustomerLastName("tope");
//    	objdao.update(cst1);
//    	System.out.println("updated");
    	
    	//delete
//    	Customer cst2=new Customer();
//    	cst2.setCustomerId(127);
//    	objdao.delete(cst2);
//    	System.out.println("deleted");
    	
    	//getall
    	Customer cst3=objdao.getCustomer(123);
    	System.out.println(cst3);
    	
    	
    	
    	
    }
}
