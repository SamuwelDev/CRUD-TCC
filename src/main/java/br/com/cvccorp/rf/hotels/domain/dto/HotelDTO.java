package br.com.cvccorp.rf.hotels.domain.dto;

public class HotelDTO {

    private long id;
    private String name;
    private String status;
    private String street;
    private String district;
    private long number;
    private String city;
    private String state;
    private String country;
    private String rating;
    private String description;
    private long averageDaily;
//Teste

    public long getId() {
        return id;
    }

    public void setId (long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRating() {
        return rating;
    }

    public void setRating (String rating){
        this.rating = rating;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription (String description){
        this.description = description;
    }

    public long getAverageDaily() {
        return averageDaily;
    }

    public void setAverageDaily(long averageDaily) {
        this.averageDaily = averageDaily;
    }
}
