package pl.deksa.springbootweatherinfodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import pl.deksa.springbootweatherinfodb.model.Weather;
import pl.deksa.springbootweatherinfodb.parser.WeatherParser;
import pl.deksa.springbootweatherinfodb.repo.WeatherRepository;

@Service
public class WeatherService {

    private WeatherRepository weatherRepo;
    private WeatherParser weatherParser;

    @Autowired
    public WeatherService(WeatherRepository weatherRepo, WeatherParser weatherParser) {
        this.weatherRepo = weatherRepo;
        this.weatherParser = weatherParser;
    }

    @Scheduled(fixedDelay = 3600000)
    public void updateDb(){
        Weather weather = weatherParser.getWeather();
        weatherRepo.save(weather);
    }
    }

