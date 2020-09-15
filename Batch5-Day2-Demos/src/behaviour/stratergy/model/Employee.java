package behaviour.stratergy.model;

import behaviour.stratergy.PayAlgorithm;

public class Employee {

	private String employeeName;
	private Designation designation;
	private PayAlgorithm payAlgorithm;
	public Employee(String employeeName, Designation designation) {
		
		this.employeeName = employeeName;
		this.designation = designation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public PayAlgorithm getPayAlgorithm() {
		return payAlgorithm;
	}
	public void setPayAlgorithm(PayAlgorithm payAlgorithm) {
		this.payAlgorithm = payAlgorithm;
	}
	public double getPay()
	{
		if(payAlgorithm==null)
		{
			return designation.getPayAlgorithm().getpay(designation.getSalary());
		}else
		{
			return payAlgorithm.getpay(designation.getSalary());
		}
	}
	
}
