package appointmentApp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;


//todo - start with add customer. make it so it saves the data to the db. Once complete make it so it shows
//todo- info in table




public class LoginScreenController implements Initializable {
    @FXML
    private AnchorPane loginAnchorPane;

    @FXML
    private TextField passWordTxtField;

    @FXML
    private Button loginBtn;

    @FXML
    private Label userNameLbl;

    @FXML
    private Label titleLbl;

    @FXML
    private TextField userNameTxtField;

    @FXML
    private Label passWordlbl;

    private ResourceBundle rb;

    Stage stage;
    Parent scene;




    @FXML
    void onActionLogin(ActionEvent event) throws IOException {
        if (userNameTxtField.getText().equals("test")&& passWordTxtField.getText().equals("test")){
            stage =(Stage) ((Button)event.getSource()).getScene().getWindow();
            scene = FXMLLoader.load(getClass().getResource("/appointmentApp/view/MainMenuScreen.fxml"));
            stage.setScene(new Scene(scene));
            stage.show();

        }
    }
    public void initialize(URL location, ResourceBundle resources) {
        // Localization - En and Sp
        // Uncomment line below for spanish testing
        //Locale.setDefault(new Locale("ES", "US"));
        Locale userLocale = Locale.getDefault();
        rb = ResourceBundle.getBundle("rb", userLocale);
        userNameLbl.setText(rb.getString("username"));
        passWordlbl.setText(rb.getString("password"));
        loginBtn.setText(rb.getString("login"));


    }
}
