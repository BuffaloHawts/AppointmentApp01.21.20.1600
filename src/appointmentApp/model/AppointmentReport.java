package appointmentApp.model;

public class AppointmentReport {

    private String month;
    private String amount;
    private String type;

    private AppointmentReport(String month, String amount, String type) {
        this.month = month;
        this.amount = amount;
        this.type = type;
    }
}
