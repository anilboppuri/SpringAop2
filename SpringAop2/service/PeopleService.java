package in.javaport.service;

import in.javaport.model.Customer;
import in.javaport.model.Employee;

public class PeopleService {
	
	private Customer customer;
	
	
	private Employee employee;
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		System.out.println("from getCustomer()...");
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		//System.out.println("from getEmployee()...");
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
