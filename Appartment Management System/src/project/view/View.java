package project.view;



import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import project.controller.Controller;

public abstract class View extends StackPane{
	private final Controller controller;

	public Controller getController() {
		return controller;
	}
	public View(Controller cont){
		this.controller=cont;
		
	}
	/*
	 * using initializers everywhere was abusive, 
	 * this method will be called in constructor.
	 * have some java edumacation, an abstract class allows interfaceish methods
	 */
	public abstract void init();

}
