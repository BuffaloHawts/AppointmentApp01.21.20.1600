package appointmentApp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportsScreenController {

    @FXML
    private TabPane ReportsTabPane;

    Stage stage;
    Parent scene;

    @FXML
    void onActionBack(ActionEvent event) throws IOException {
        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/MainMenuScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

}
