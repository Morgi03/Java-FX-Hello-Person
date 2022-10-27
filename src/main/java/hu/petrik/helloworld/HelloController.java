package hu.petrik.helloworld;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label koszontesSzoveg;

    @FXML
    private TextField nevMezo;

    @FXML
    protected void koszontes(ActionEvent actionEvent) {
        String nev = this.nevMezo.getText().trim();
        if (nev.isEmpty()) {
            Alert felugroAblak = new Alert(Alert.AlertType.WARNING);
            felugroAblak.setHeaderText("Figyelmeztetés");
            felugroAblak.setContentText("Kérem adja meg a nevét");
           // felugroAblak.getButtonTypes().add(ButtonType.CLOSE);
            felugroAblak.show();
            this.koszontesSzoveg.setText("");
        } else {
            this.koszontesSzoveg.setText("Hello "+nev+"!");
        }
    }
}