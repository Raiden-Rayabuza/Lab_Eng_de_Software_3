package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;
import controller.MainController;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			MainController controller = new MainController();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			loader.setController(controller);
			SplitPane root = loader.load();
			Scene scene = new Scene(root,300,750);
			stage.setTitle("Inicio");
			stage.setScene(scene);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
