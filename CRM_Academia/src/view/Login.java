package view;

import controller.LoginViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login extends Application {
	private static Stage stage;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			LoginViewController controller = new LoginViewController();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
			loader.setController(controller);
			Pane root = loader.load();
			Scene scene = new Scene(root,458,425);
			stage.setTitle("Login");
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
		Login.stage = stage;
	}
	
}
