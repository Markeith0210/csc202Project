package project;

import project.controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class RunMe extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	Stage primaryStage;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Controller controller = new Controller(primaryStage);
		controller.getLoginView().show();


	}
}
