package Payroll;

public class Employee {
	
	String first;
	String last;
	String title;
	double pay;
	
	public Employee(String firstName, String lastName, String jobTitle, double salary) {
		first = firstName;	
		last = lastName;
		title = jobTitle;
		pay = salary;
	}
	
	public void getFullName() {
		System.out.println(first + " " + last);
	}
	
	public void getTitle() {
		System.out.println(title);
	}
	
	public void getSalary() {
		System.out.println("$" + pay);
		System.out.println();
	}
	
	public void editName(String first, String last) {
		this.first = first;
		this.last = last;
	}
		
	public void editTitle(String title) {
		this.title = title;
	}
	
	public void editPay(double pay) {
		this.pay = pay;
	}

}
