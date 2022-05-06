package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class LoginController implements Initializable {
	@FXML
	private Text txtBoasVindas;
	@FXML
	private Pane pnConteudo;
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		System.out.println("Funciona");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
