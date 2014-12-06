package project.view;


import project.controller.Controller;
import project.view.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MakeUserView extends View {
	private GridPane grid = new GridPane();
	private Label emailLabel = new Label("Email:");
	private TextField email = new TextField();
	private Label passwordLabel = new Label("Password:");
	private TextField password = new TextField();
	private Label nameLabel = new Label("Name:");
	private TextField name = new TextField();
	private Label phoneNumberLabel = new Label("Phone#:");
	private TextField phoneNumber = new TextField();
	private Button addUser = new Button("Add User");
	private Button cancel = new Button("Cancel");
	
	public MakeUserView(Controller cont) {
		super(cont);
		init();
	}
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

	@Override
	public void init() {
		
		this.grid.setHgap(10);
		this.grid.setVgap(10);
		this.grid.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
		this.grid.add(this.emailLabel, 1, 0);
		this.grid.add(this.email, 2, 0);
		this.grid.add(this.passwordLabel, 1, 1);
		this.grid.add(this.password, 2, 1);
		this.grid.add(this.nameLabel, 1, 2);
		this.grid.add(this.name, 2, 2);
		this.grid.add(this.phoneNumberLabel, 1, 3);
		this.grid.add(this.phoneNumber, 2, 3);
		// layout
		HBox buttonLine = new HBox();
		buttonLine.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
		addUser.setOnAction(addUserEvent);
		cancel.setOnAction(cancelEvent);
		buttonLine.getChildren().addAll(addUser, cancel);
		buttonLine.setSpacing(10);
		VBox stack = new VBox();
		stack.getChildren().addAll(grid, buttonLine);
		stack.setSpacing(10);
		this.getChildren().add(stack);
	}
	
}
