package daggerok.props;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class TestGeoFilterConfig {

  @Bean
  CommandLineRunner test(final GeoFilter geoFilter) {
    return args -> log.info("\n--- BEGIN ---{}\n--- FINISH ---", geoFilter);
  }
}
