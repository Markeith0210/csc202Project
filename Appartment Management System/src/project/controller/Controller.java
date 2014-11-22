package project.controller;

import project.model.User;
import project.service.UserService;
import project.view.EmployeeView;
import project.view.LoginView;
import project.view.MakeUserView;
import project.view.ManagementView;
import project.view.RenterView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * this will contain any stateful objects, getters for the view screens, and (latter)getters for the event handlers.
 * 
 * considering putting them in hashmaps, so I can just use strings to call them, would make things more loosely coupled :x
 * @author william
 *
 */
public class Controller {
	public Controller(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
	}

	private UserService userService = new UserService();
	private Stage primaryStage;
	private Scene makeUserScene =new Scene(new MakeUserView(this), 300, 200);
	private Scene makeLoginScene =new Scene(new LoginView(this), 300, 150);
	private Scene makeRenterScene =new Scene(new RenterView(this), 300, 200);
	private Scene makeEmployeeScene =new Scene(new EmployeeView(this), 300, 150);
	private Scene makeManagementScene =new Scene(new ManagementView(this), 300, 150);
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	public Stage getLoginView(){
		this.getPrimaryStage().setScene(this.makeLoginScene);
		return primaryStage;
	}
	public Stage getMakeUserView(){
		this.getPrimaryStage().setScene(this.makeUserScene);
		return primaryStage;
	}
	public Stage getRenterView(){
		this.getPrimaryStage().setScene(this.makeRenterScene);
		return primaryStage;
	}
	public Stage getEmployeeView(){
		this.getPrimaryStage().setScene(this.makeEmployeeScene);
		return primaryStage;
	}
	public Stage getManagementView(){
		this.getPrimaryStage().setScene(this.makeManagementScene);
		return primaryStage;
	}
	
	public void makeUserAction(String email, String password,String name, String phoneNumber){
		
		userService.makeUser(new User( email,  password, name, phoneNumber));
	}
}
