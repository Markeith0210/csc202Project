package project.view;

import project.controller.Controller;
import project.service.UserService;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * the Login View, instead of normal mvc, this will use an event driven
 * architecture, as is natural for javafx.
 * 
 * @author squish
 *
 */
public class LoginView extends View {
	private UserService userService = new UserService();
	private Label emailLabel = new Label("Email:");
	private TextField email = new TextField();
	private Label passwordLabel = new Label("Password:");
	private TextField password = new TextField();
	
	/**
	 * login event, calls UserService
	 */
	private EventHandler<ActionEvent> loginEvent = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			userService.login(email.getText(), password.getText());
		}
	};
	private EventHandler<ActionEvent> makeUserEvent = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			getController().getMakeUserView().show();
		}
	
	};

	public LoginView(Controller controller) {
		super(controller);
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
		this.getController().getPrimaryStage().setTitle("Login");
		grid.add(emailLabel, 1, 0);
		grid.add(email, 2, 0);
		grid.add(passwordLabel, 1, 1);
		grid.add(password, 2, 1);
		Button login = new Button("Login");
		Button makeUser = new Button("Make New User");
		login.setOnAction(this.loginEvent);
		makeUser.setOnAction(this.makeUserEvent);
		// layout
		HBox buttonLine = new HBox();
		buttonLine.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));
		buttonLine.getChildren().addAll(login, makeUser);
		buttonLine.setSpacing(10);
		VBox stack = new VBox();
		stack.getChildren().addAll(grid, buttonLine);
		stack.setSpacing(10);
		this.getChildren().add(stack);
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}