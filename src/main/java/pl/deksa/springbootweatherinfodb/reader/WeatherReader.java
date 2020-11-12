package pl.deksa.springbootweatherinfodb.reader;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.deksa.springbootweatherinfodb.reader.json.WeatherData;


@RestController
public class WeatherReader implements DataReader{

    private static final String URL = "https://api.weatherapi.com/v1/current.json?key=e1288c0f29764daaaad102535200211&q=Czestochowa";

    @Override
    public ResponseEntity readData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(URL,
                                    HttpMethod.GET,
                                    HttpEntity.EMPTY,
                                    WeatherData.class);

    }
}
