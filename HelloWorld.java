import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{
	public void start(Stage stage){
		Label la = new Label("Hello JAVA");
		StackPane root = new StackPane(la);
		Scene scene = new Scene(root,300,300);
		stage.setScene(scene);
		stage.setTitle("Hello JAVA Program");
		stage.show();
	}
	public static void main(String []args){
		launch(args);
	}
} 