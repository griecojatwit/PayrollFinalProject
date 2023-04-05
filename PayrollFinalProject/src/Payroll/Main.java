package Payroll;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Add button to add new employee
		System.out.println("Enter employees first name: ");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		
		System.out.println("Enter employees last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter employees job title: ");
		String jobTitle = scanner.nextLine();
		
		System.out.println("Enter employees salary: ");
		double salary = scanner.nextDouble();
		
		scanner.close();
		
		//System.out.println(firstName + " " + lastName + " " + jobTitle + " " + salary + ".");
		
		Employee one = new Employee(firstName, lastName, jobTitle, salary);
		one.getFullName();
		one.getTitle();
		one.getSalary();
		
		

	}

}
