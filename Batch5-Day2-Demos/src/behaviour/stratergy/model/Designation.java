package behaviour.stratergy.model;

import behaviour.stratergy.PayAlgorithm;

public class Designation {

	private String designation;
	private PayAlgorithm payAlgorithm;
	private double salary;
	public Designation(String designation, PayAlgorithm payAlgorithm, double salary) {

		this.designation = designation;
		this.payAlgorithm = payAlgorithm;
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public PayAlgorithm getPayAlgorithm() {
		return payAlgorithm;
	}
	public void setPayAlgorithm(PayAlgorithm payAlgorithm) {
		this.payAlgorithm = payAlgorithm;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}

