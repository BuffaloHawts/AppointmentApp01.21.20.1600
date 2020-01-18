package appointmentApp.model;

public class City {

    private Integer cityId;
    private String city;
    private Integer countryId;

    private Integer getCityId() {
        return cityId;
    }

    private void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private Integer getCountryId() {
        return countryId;
    }

    private void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    private City(Integer cityId, String city, Integer countryId) {
        this.cityId = cityId;
        this.city = city;
        this.countryId = countryId;


    }
}
