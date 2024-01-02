package com.yash.controller;

import java.util.List;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.Dao.EmpDao;
import com.yash.model.Employee;

@Controller
public class EmpController 
{

	@Autowired
	EmpDao empdao;
	
	@RequestMapping("/empform")
	public String showFrom(Model m)
	{
		//m.addAttribute("commond",new Employee());
		return "empform";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute Employee emp,BindingResult br)
	{
		System.out.println(emp.toString());
		empdao.save(emp);
		return "redirect:/viewemp";
		//return "redirect:/viewemp";
	}
	
//	@RequestMapping("/viewemp")
//	public String m1()
//	{
//		return "viewfrom";
//	}
	
	
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m)
	{
		List<Employee>list=empdao.getEmployees();
		m.addAttribute("employee", list);
//		for(Object oo:list)
//		{
//			System.out.println(oo);
//		}
		return "viewfrom";
	}
	
	@RequestMapping(value="/deleteemp/{id}",method=RequestMethod.GET)
	public String delete( @PathVariable int id)
	{
		empdao.delete(id);
		System.out.println(id);
		return "redirect:/viewemp";
	}
	

	@RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Employee emp=empdao.getEmpById(id);    
        m.addAttribute("command",emp);  
        System.out.println(id);
        return "editform";    
    }  
	
	@RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee emp)
	{
		empdao.update(emp);
		return "redirect:/viewemp";
	}
	
	
	
	
	
}
