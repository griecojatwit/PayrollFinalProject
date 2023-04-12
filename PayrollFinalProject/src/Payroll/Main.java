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
	Scanner input = new Scanner(System.in);
	
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
		System.out.printf("Please enter first name: %n");
		first = input.nextLine();
		System.out.printf("Please enter last name: %n");
		last = input.nextLine();
		System.out.printf("Please enter title name: %n");
		title = input.nextLine();
		System.out.printf("Please enter salary: %n");
		pay = input.nextDouble();
		
		employeeArr.add(new Employee(first, last, title, pay));
		
	});
		
	btnE.setOnAction(e->{
		
	});
		
	btnV.setOnAction(e->{
		for (int i = 0; i < employeeArr.size(); i++) {
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
