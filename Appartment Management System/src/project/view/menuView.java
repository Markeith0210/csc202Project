package project.view;

import project.controller.Controller;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;


public abstract class menuView extends View{
	public menuView(Controller cont) {
		super(cont);
		// TODO Auto-generated constructor stub
	}

	private MenuBar menuBar = new MenuBar();
	private Menu menu = new Menu("Menu");	
	private MenuItem logout = new MenuItem("logout");
	private MenuItem exit = new MenuItem("exit");
	
	//These are called initializer blocks. They're like constructors, 
	//but they happen before every constructor. 
	//They also implicitly execute parent class initializers before child.
	//And they can be static or dynamic, this is a dynamic example.
	//It's a cool demo tool for the difference between static and dynamic. :p
	/*
	 * initializes the outer menu bar
	 */
	{
		
		menu.getItems().addAll(logout,exit);
		
		this.getChildren().add(menuBar);
	}

}
