package appointmentApp.model;

public class Country {

    private Integer countryId;
    private String country;

    private Country(Integer countryId, String country) {
        this.countryId = countryId;
        this.country = country;
    }

    private Integer getCountryId() {
        return countryId;
    }

    private void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    private String getCountry() {
        return country;
    }

    private void setCountry(String country) {
        this.country = country;
    }


}
