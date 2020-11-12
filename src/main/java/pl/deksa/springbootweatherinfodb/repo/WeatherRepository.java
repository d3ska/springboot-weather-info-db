package pl.deksa.springbootweatherinfodb.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.deksa.springbootweatherinfodb.model.Weather;



@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    Weather save(Weather weather);

}
