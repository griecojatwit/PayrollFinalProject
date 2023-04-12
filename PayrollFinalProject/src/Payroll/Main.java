package Payroll;

import java.util.Scanner;

import java.util.ArrayList;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.*;

public class Main extends Application {
	int count = 0;
	String first;
	String last;
	String title;
	double pay;
	ArrayList<Employee> employeeArr = new ArrayList<Employee>();
	
@Override
	
public void start (Stage s) {
	
	final HBox pane = new HBox(100);
	pane.setAlignment(Pos.CENTER);
	final Button btnA = new Button("Add");
	final Button btnE = new Button("Edit");
	final Button btnV = new Button("View");
	pane.getChildren().addAll(btnA, btnE, btnV);
	s.setTitle("Payroll Manager");
	s.setScene(new Scene(pane));
	s.show();
	
	btnA.setOnAction(e->{
		
		count++;
		
		System.out.printf("Please enter first name: ");
		Scanner input = new Scanner(System.in);
		first = input.nextLine();
		
		System.out.printf("Please enter last name: ");
		last = input.nextLine();
		
		System.out.printf("Please enter title name: ");
		title = input.nextLine();
		
		System.out.printf("Please enter salary: ");
		pay = input.nextDouble();
		
		employeeArr.add(new Employee(first, last, title, pay));
		
		
	});
		
	btnE.setOnAction(e->{
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.printf("Which employee would you like to edit: ");
		num = input.nextInt();
		num -= 1;
		
		
		System.out.printf("Please enter first name: ");
		Scanner in = new Scanner(System.in);
		first = in.nextLine();
		
		System.out.printf("Please enter last name: ");
		last = in.nextLine();
		
		System.out.printf("Please enter title name: ");
		title = in.nextLine();
		
		System.out.printf("Please enter salary: ");
		pay = in.nextDouble();
		
		employeeArr.get(num).editName(first, last);
		employeeArr.get(num).editTitle(title);
		employeeArr.get(num).editPay(pay);
	});
		
	btnV.setOnAction(e->{
		for (int i = 0; i < employeeArr.size(); i++) {
			System.out.printf("%n%d.%n", i + 1);
			employeeArr.get(i).getFullName();
			employeeArr.get(i).getTitle();
			employeeArr.get(i).getSalary();
		}
	});
}

	public static void main(String[] args ) {
		launch(args);
	}
}
