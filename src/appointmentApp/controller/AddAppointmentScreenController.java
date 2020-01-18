package appointmentApp.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddAppointmentScreenController {

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private ComboBox<String> typeComboBox;

    @FXML
    private Label startLbl;

    @FXML
    private ComboBox<String> startComboBox;

    @FXML
    private Label dateLbl;

    @FXML
    private TableView<String> customerNameTableView;

    @FXML
    private ComboBox<String> finishComboBox;

    @FXML
    private TableColumn<?, ?> customerNameCol;

    @FXML
    private Label titleLbl;

    @FXML
    private Label typeLbl;

    @FXML
    private Label finishLbl;

    @FXML
    private TextField titleTxtFiield;

    @FXML
    private Button saveBtn;

    Stage stage;
    Parent scene;

    @FXML
    void onActionSaveAppointment(ActionEvent event) {

    }

    @FXML
    void onActionBack(ActionEvent event) throws IOException {
        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/MainMenuScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

}