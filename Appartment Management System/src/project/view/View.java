package project.view;

import javafx.scene.layout.StackPane;
import project.controller.Controller;

public class View extends StackPane{
	private final Controller controller;

	public Controller getController() {
		return controller;
	}
	public View(Controller cont){
		this.controller=cont;
	}

	public void testScope(){
		System.out.println("works");
	}
}
