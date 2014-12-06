package project.view;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import project.controller.Controller;
import project.model.Task;

public class EmployeeView extends View{

	public EmployeeView(Controller cont) {
		super(cont);

	}
	{
		this.getController().getPrimaryStage().setTitle("Employee");		
		TableView<Task> table = new TableView<Task>();
		
		TableColumn<Task, String> taskId = new TableColumn<Task, String>("First Name");
		TableColumn<Task, String> roomNumber = new TableColumn<Task, String>("First Name");
		TableColumn<Task, String> description = new TableColumn<Task, String>("First Name");
		TableColumn<Task, String> dateSubmited = new TableColumn<Task, String>("First Name");
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new javafx.geometry.Insets(10, 10, 10, 10));


		Button login = new Button("Login");
		Button makeUser = new Button("Make New User");

		// layout
		HBox buttonLine = new HBox();
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
