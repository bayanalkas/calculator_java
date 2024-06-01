package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public  class Main extends Application {

	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("calculatorFXML.fxml")); //pulling in the scene builder file
		stage.setMaximized(true);
		stage.setTitle("postfix Calcultor"); //creating a title for output
		stage.setScene(new Scene(root));    
		stage.show();                               //displaying the output stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}

