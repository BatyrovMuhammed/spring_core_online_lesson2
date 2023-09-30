package legendSoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.concurrent.LinkedBlockingDeque;

@Configuration
@ComponentScan("legendSoft")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
  public Throwable bean(){
      return new Throwable();
  }
}
