package appointmentApp.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button viewCustomerBtn;

    @FXML
    private Button exitBtn;

    @FXML
    private Button viewReportsBtn;

    @FXML
    private Button viewAptBtn;

    Stage stage;
    Parent scene;

    @FXML
    void onActionViewApt(ActionEvent event) throws IOException {

        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/AppointmentScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionViewCustomer(ActionEvent event) throws IOException {

        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/CustomerScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionViewReports(ActionEvent event) throws IOException {

        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/ReportsScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionExit() {

        System.exit(0);

    }

}
