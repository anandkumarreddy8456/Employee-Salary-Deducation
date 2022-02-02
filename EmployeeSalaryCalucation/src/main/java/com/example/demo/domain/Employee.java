package com.example.demo.domain;

public class Employee {
	public double tax;
	public double salary;
	public double nsal;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void setNsal(double nsal) {
		this.nsal = nsal;
	}
	public double getTax() {
		return tax;
	}
	public double getNsal() {
		return nsal;
	}
	
	
	public double getTaxs() {
		if(salary>50000) {
			tax= salary * 10/100;
			System.out.print(tax);
		}
		else if(salary>35000) {
			tax=salary*5/100;
		}
		else if(salary<35000) {
			tax=0;
		}
		return tax;
	}
	public double getNsals() {
		nsal=salary-tax;
		return nsal;
	}
}
