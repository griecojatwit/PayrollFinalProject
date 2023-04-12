package Payroll;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.*;

public class Main extends Application {
@Override
	
public void start (Stage s) {
			
		final HBox pane = new HBox(100);
		pane.setAlignment(Pos.CENTER);
		final Button btnP = new Button("Add");
		final Button btnM = new Button("Mama");
		final Button btnB = new Button("Baby");
		pane.getChildren().addAll(btnP, btnM, btnB);
		s.setTitle("Goldilocks and the Three Buttons");
		s.setScene(new Scene(pane));
		s.show();
		
		btnP.setOnAction(e->{
			System.out.printf("Too Hot!%n");
		});
		
		btnM.setOnAction(e->{
			System.out.printf("Too Cold!%n");
		});
		
		btnB.setOnAction(e->{
			System.out.printf("Just Right!%n");
		});
	}

	public static void main(String[] args ) {
		launch(args);
	}
}
