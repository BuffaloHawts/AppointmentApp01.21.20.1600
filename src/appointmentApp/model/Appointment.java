package appointmentApp.model;

public class Appointment {

    private Integer appointmentId;
    private Customer customer;
    private String title;
    private String description;
    private String start;
    private String end;
    private String user;

    private Appointment(Integer appointmentId, Customer customer, String title, String description, String start, String end, String user) {
        this.appointmentId = appointmentId;
        this.customer = customer;
        this.title = title;
        this.description = description;
        this.start = start;
        this.end = end;
        this.user = user;
    }

    private Integer getAppointmentId() {
        return appointmentId;
    }

    private void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    private Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private String getStart() {
        return start;
    }

    private void setStart(String start) {
        this.start = start;
    }

    private String getEnd() {
        return end;
    }

    private void setEnd(String end) {
        this.end = end;
    }

    private String getUser() {
        return user;
    }

    private void setUser(String user) {
        this.user = user;
    }
}
