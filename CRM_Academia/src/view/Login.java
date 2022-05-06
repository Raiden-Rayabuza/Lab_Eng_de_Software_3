package view;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Login extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			LoginController controller = new LoginController();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
			loader.setController(controller);
			Pane root = loader.load();
			Scene scene = new Scene(root,458,425);
			stage.setTitle("Inicio");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
