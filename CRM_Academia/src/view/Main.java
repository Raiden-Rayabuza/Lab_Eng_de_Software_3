package view;

import controller.MainViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage stage;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			MainViewController controller = new MainViewController();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			loader.setController(controller);
			SplitPane root = loader.load();
			Scene scene = new Scene(root,700,700);
			stage.setTitle("Inicio");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			setStage(stage);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		Main.stage = stage;
	}
	
}
