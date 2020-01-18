package appointmentApp.model;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String addressOne;
    private String addressTwo;
    private City city;
    private Country country;
    private String postalCode;
    private String phone;

    private Customer(Integer customerId, String customerName, String addressOne, String addressTwo, City city, Country country, String postalCode, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.phone = phone;
    }


    private Integer getCustomerId() {
        return customerId;
    }

    private void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    private String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String getAddressOne() {
        return addressOne;
    }

    private void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    private String getAddressTwo() {
        return addressTwo;
    }

    private void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    private City getCity() {
        return city;
    }

    private void setCity(City city) {
        this.city = city;
    }

    private Country getCountry() {
        return country;
    }

    private void setCountry(Country country) {
        this.country = country;
    }

    private String getPostalCode() {
        return postalCode;
    }

    private void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;


    }
}
