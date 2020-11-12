package pl.deksa.springbootweatherinfodb.parser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.deksa.springbootweatherinfodb.model.Weather;
import pl.deksa.springbootweatherinfodb.reader.DataReader;
import pl.deksa.springbootweatherinfodb.reader.json.Current;
import pl.deksa.springbootweatherinfodb.reader.json.Location;
import pl.deksa.springbootweatherinfodb.reader.json.WeatherData;


@Service
public class WeatherParser {

    private DataReader dataReader;

    @Autowired
    public WeatherParser(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public Weather getWeather(){
        ResponseEntity responseEntity = dataReader.readData();
        WeatherData data = (WeatherData) responseEntity.getBody();
        Weather weather = getParsedWeather(data);
        return weather;

    }

    private Weather getParsedWeather(WeatherData data) {
        Current current = data.getCurrent();
        Location location = data.getLocation();

        String city = location.getName();
        String country = location.getCountry();
        String localtime = location.getLocaltime().substring(0, 10);
        String tempC = String.valueOf(current.getTempC());
        String tempF = String.valueOf(current.getTempF());
        String pressureMb = String.valueOf(current.getPressureMb());
        String description = current.getCondition().getText();
        String windKph = String.valueOf(current.getWindKph());
        String windMph = String.valueOf(current.getWindMph());
        String feelsLike = String.valueOf(current.getFeelslikeC());

        return  new Weather(city, country, localtime, tempC, tempF, pressureMb, description, windKph, windMph, feelsLike);
    }
}
