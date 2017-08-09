package daggerok.props;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

@Component
@PropertySource("classpath:GeoFilter.properties")
public class GeoFilter {

  @Autowired Environment environment;

  @Override
  public String toString() {

    val value = environment.getProperty("my.geo.value");
    val list = environment.getProperty("my.geo.list");
    val splits = Arrays.stream(environment.getProperty("my.geo.splits")
                                          .split(":"))
                       .collect(toList());

    return format("\nvalue: %s\n list (no split): %s\nvalues (after split): %s", value, list, splits);
  }
}
