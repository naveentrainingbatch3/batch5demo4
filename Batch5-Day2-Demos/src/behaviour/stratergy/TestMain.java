package behaviour.stratergy;

import behaviour.stratergy.impl.InternPayAlgorithm;
import behaviour.stratergy.impl.TraineePayAlgorithm;
import behaviour.stratergy.impl.WebDesignerAlgorithm;
import behaviour.stratergy.impl.WebDeveloperPayAlgorithm;
import behaviour.stratergy.model.Designation;
import behaviour.stratergy.model.Employee;

public class TestMain {

	public static void main(String[] args) {
		PayAlgorithm interPayAlgorithm=new InternPayAlgorithm();
		PayAlgorithm traineePayAlgorithm=new TraineePayAlgorithm();
		PayAlgorithm webDesignerPayAlgorithm=new WebDesignerAlgorithm();
		PayAlgorithm webDeveloperPayAlgorithm=new WebDeveloperPayAlgorithm();
		
		Designation intern=new Designation("Intern", interPayAlgorithm, 20000);
		Designation trainee=new Designation("Trainee", traineePayAlgorithm, 25000);
		Designation webDesigner=new Designation("WebDesigner", webDesignerPayAlgorithm, 30000);
		Designation webDeveloper=new Designation("WebDeveloper", webDeveloperPayAlgorithm, 35000);
		Employee emp1=new Employee("Yash Garg", intern);
		Employee emp2=new Employee("Vartika Sharma", trainee);
		Employee emp3=new Employee("Tanya Bansal", webDesigner);
		Employee emp4=new Employee("Saumya Raj", webDeveloper);
		
		System.out.println(emp1.getEmployeeName()+" with  designation "+emp1.getDesignation().getDesignation()+" and total pay is "+emp1.getPay());
		System.out.println(emp2.getEmployeeName()+" with  designation "+emp2.getDesignation().getDesignation()+" and total pay is "+emp2.getPay());
		System.out.println(emp3.getEmployeeName()+" with  designation "+emp3.getDesignation().getDesignation()+" and total pay is "+emp3.getPay());
		System.out.println(emp4.getEmployeeName()+" with  designation "+emp4.getDesignation().getDesignation()+" and total pay is "+emp4.getPay());
		System.out.println("Changing Pay Algorithm for employee emp1");
		emp1.setPayAlgorithm(traineePayAlgorithm);
		System.out.println(emp1.getEmployeeName()+" with  designation "+emp1.getDesignation().getDesignation()+" and total pay is "+emp1.getPay());
		
		
	}
}
