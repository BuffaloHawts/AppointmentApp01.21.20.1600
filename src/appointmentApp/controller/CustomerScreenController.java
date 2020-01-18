package appointmentApp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerScreenController {

    @FXML
    private Label customerIdLbl;

    @FXML
    private Label addressTwoLbl;

    @FXML
    private TextField addressTwoTxtField;

    @FXML
    private TextField postalCodeTxtField;

    @FXML
    private Button deleteCustomerBtn;

    @FXML
    private TextField customerNameTxtField;

    @FXML
    private Button cancelCustomerBtn;

    @FXML
    private TableView<?> customerTableView;

    @FXML
    private Label customerNameLbl;

    @FXML
    private Button editCustomerBtn;

    @FXML
    private Button addNewCustomerBtn;

    @FXML
    private ComboBox<?> cityComboBox;

    @FXML
    private TextField addressOneTxtField;

    @FXML
    private TextField countryTxtField;

    @FXML
    private TableColumn<?, ?> customerNameCol;

    @FXML
    private Label addressOneLbl;

    @FXML
    private TextField customerIdTxtField;

    @FXML
    private Label countryLbl;

    @FXML
    private Label phoneLbl;

    @FXML
    private TextField phoneTxtField;

    @FXML
    private TableColumn<?, ?> customerIdCol;

    @FXML
    private Label cityLbl;

    @FXML
    private Label postalCodeLbl;

    @FXML
    private Button saveCustomerBtn;

    Stage stage;
    Parent scene;

    @FXML
    void onActionAddNewCustomer(ActionEvent event) {

    }

    @FXML
    void onActionEditCustomer(ActionEvent event) {

    }

    @FXML
    void onActionDeleteCustomer(ActionEvent event) {

    }

    @FXML
    void onActionSaveCustomer(ActionEvent event) {

    }

    @FXML
    void onActionBack(ActionEvent event) throws IOException {
        stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/MainMenuScreen.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();
    }

}
