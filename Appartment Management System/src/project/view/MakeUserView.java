package project.view;

import project.service.UserService;
import project.controller.Controller;
import project.view.View;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MakeUserView extends View {
	
	public MakeUserView(Controller cont) {
		super(cont);
		// TODO Auto-generated constructor stub
	}
	Label emailLabel = new Label("Email:");
	TextField email = new TextField();
	Label passwordLabel = new Label("Password:");
	TextField password = new TextField();
	Label nameLabel = new Label("Name:");
	TextField name = new TextField();
	Label phoneNumberLabel = new Label("Phone#:");
	TextField phoneNumber = new TextField();
	
	Button addUser = new Button("Add User");
	Button cancel = new Button("Cancel");
	
	private EventHandler<ActionEvent> addUserEvent = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			getController().makeUserAction(email.getText(), password.getText(), name.getText(), phoneNumber.getText());
		}
	};
	
	private EventHandler<ActionEvent> cancelEvent = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			
			getController().getLoginView();
		}
	
	};
	{
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
		grid.add(emailLabel, 1, 0);
		grid.add(email, 2, 0);
		grid.add(passwordLabel, 1, 1);
		grid.add(password, 2, 1);
		grid.add(nameLabel, 1, 2);
		grid.add(name, 2, 2);
		grid.add(phoneNumberLabel, 1, 3);
		grid.add(phoneNumber, 2, 3);
		// layout
		HBox buttonLine = new HBox();
		buttonLine.getChildren().addAll(addUser, cancel);
		buttonLine.setSpacing(10);
		VBox stack = new VBox();
		stack.getChildren().addAll(grid, buttonLine);
		stack.setSpacing(10);
		this.getChildren().add(stack);
	}
	
}
