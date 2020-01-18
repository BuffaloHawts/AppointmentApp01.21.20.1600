package appointmentApp;

import appointmentApp.util.DBConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;


public class AppointmentApp extends Application {

//Call login screen



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent loginScreen = FXMLLoader.load(getClass().getResource("/appointmentApp/view/LoginScreen.fxml"));
        primaryStage.setTitle("Appointment Creator");
        primaryStage.setScene(new Scene(loginScreen));
        primaryStage.show();
    }


    public static void main(String[] args) {
        try {
        DBConnection.startConnection();
        launch(args);
        DBConnection.closeConnection();
        }
        catch (SQLException e) {
            System.out.println("Error " +e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//THIS CODE WAS FOR TESTING THE DB CONNECTION - THIS WILL BE USED TO QUERY THE DB IN OTHER CLASSES
//KEEP UNTIL NO LONGER NEEDED

    //static Connection conn = DBConnection.startConnection();

/*  //Create statement object
         Statement stmt = conn.createStatement();

        // Write SQL Statement
        String sqlStatement = "SELECT * FROM employee_tbl";

        // Execute statement and create result set object
        ResultSet result = stmt.executeQuery(sqlStatement);

        // Get all records from ResultSet object
        while (result.next()){

            System.out.print(result.getInt("EmployeeID") + ", ");
            System.out.print(result.getString("EmployeeName") + ", ");
            System.out.print(result.getString("Department") + ", ");
            System.out.print(result.getDate("HireDate"));
            System.out.print(result.getTime("HireDate"));
            System.out.println();

        }*/