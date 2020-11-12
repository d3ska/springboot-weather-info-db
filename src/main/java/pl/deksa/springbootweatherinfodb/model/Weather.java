package pl.deksa.springbootweatherinfodb.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String country;
    private String date;
    private String tempC;
    private String tempF;
    private String pressureMb;
    private String description;
    private String windKph;
    private String windMph;
    private String feelslike_c;


    public Weather(String city, String country, String date, String tempC, String tempF, String pressureMb, String description, String windKph, String windMph, String feelslike_c) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.tempC = tempC;
        this.tempF = tempF;
        this.pressureMb = pressureMb;
        this.description = description;
        this.windKph = windKph;
        this.windMph = windMph;
        this.feelslike_c = feelslike_c;
    }

    public Weather() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String localtime) {
        this.date = localtime;
    }

    public String getTempC() {
        return tempC;
    }

    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    public String getTempF() {
        return tempF;
    }

    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    public String getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(String pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWindKph() {
        return windKph;
    }

    public void setWindKph(String windKph) {
        this.windKph = windKph;
    }

    public String getWindMph() {
        return windMph;
    }

    public void setWindMph(String windMph) {
        this.windMph = windMph;
    }

    public String getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(String feelslike_c) {
        this.feelslike_c = feelslike_c;
    }
}
