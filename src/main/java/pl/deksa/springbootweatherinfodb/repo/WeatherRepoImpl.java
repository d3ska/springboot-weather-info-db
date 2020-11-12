package pl.deksa.springbootweatherinfodb.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.deksa.springbootweatherinfodb.model.Weather;

@Repository
public class WeatherRepoImpl {

    private WeatherRepository weatherRepo;

    @Autowired
    public WeatherRepoImpl(WeatherRepository weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    public Weather save(Weather weather){
        return weatherRepo.save(weather);
    }
}
