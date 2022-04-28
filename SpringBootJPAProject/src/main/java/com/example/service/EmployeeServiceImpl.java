package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.dao.EmployeeDao;
import com.example.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployees() {
	return employeeDao.findAll();
	}



	@Override
	public Employee getEmployeeById(long employeeid) {
	return employeeDao.getOne(employeeid);
	}



	@Override
	public Employee addEmployee(Employee employee) {
	employeeDao.save(employee);
	return employee;
	}



	@Override
	public void deleteEmployee(long employeeid) {
	Employee obj= employeeDao.getOne(employeeid);
	employeeDao.delete(obj);
	}



	@Override
	public Employee updateEmployee(Employee employee) {
	employeeDao.save(employee);
	return employee;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//  List<Employee> lst;
//  public EmployeeServiceImpl() {
//	  lst=new ArrayList<Employee>();
//	  lst.add(new Employee(1,"ad","software developer"));
//	  lst.add(new Employee(2,"bhargav","software developer"));
//	  lst.add(new Employee(3,"manish","software developer"));
//	  lst.add(new Employee(4,"ajay","software developer"));
//  }
//  @Override
//  public List<Employee> getEmployees(){
//	  return lst;
//  }
//@Override
//public Employee getEmployeeById(long employeeid) {
//	// TODO Auto-generated method stub
//	Employee emp=null;
//	for(Employee e:lst) {
//		if(e.getId()==employeeid) {
//			emp=e;
//			break;
//		}
//		
//	}
//	return emp;
//	
//}
//@Override
//public Employee addEmployee(Employee employee) {
//	// TODO Auto-generated method stub
//	lst.add(employee);
//	return employee;
//	
//}
//@Override
//public void deleteEmployee(long employeeid) {
//	// TODO Auto-generated method stub
//	lst=this.lst.stream().
//			filter((x)->x.getId()!=employeeid)
//			.collect(Collectors.toList() );
//	
//}
//@Override
//public Employee updateEmployee(Employee employee) {
//	
//	// TODO Auto-generated method stub
//	lst.forEach((t)->{
//		if(t.getId()==employee.getId()) {
//			t.setEmployeename(employee.getEmployeename());
//			t.setDesignation(employee.getDesignation());
//		}
//	});
//return null;	
//}
//  
//}
