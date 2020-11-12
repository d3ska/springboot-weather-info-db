package pl.deksa.springbootweatherinfodb.reader;

import org.springframework.http.ResponseEntity;

public interface DataReader {
    ResponseEntity readData();
}
