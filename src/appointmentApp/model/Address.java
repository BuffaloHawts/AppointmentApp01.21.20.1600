package appointmentApp.model;

public class Address {

    private Integer addressId;
    private String addressOne;
    private String addressTwo;
    private String postalCode;
    private String phone;
    private Integer cityId;

    private Address(Integer addressId, String addressOne, String addressTwo, String postalCode, String phone, Integer cityId) {
        this.addressId = addressId;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.postalCode = postalCode;
        this.phone = phone;
        this.cityId = cityId;
    }

    private Integer getAddressId() {
        return addressId;
    }

    private void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    private Integer getCityId() {
        return cityId;
    }

    private void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
