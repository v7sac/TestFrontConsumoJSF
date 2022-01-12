package com.journaldev.jsfBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.journaldev.data.Employee;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public ViewEmployeesManagedBean(){
		
	}
	
	@PostConstruct
	public void populateEmployeeList(){
		for(int i = 1 ; i <= 10 ; i++){
			Employee emp = new Employee();
			emp.setPlaca("HFK"+i);
			emp.setEmpresa("Empresa"+i);
			emp.setTipoIdentificacion("NIT");
			emp.setIdentificacion("105648963"+i);
			emp.setNumeroConductores("4");
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
