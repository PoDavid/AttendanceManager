package church.morningclass.attendancemanager.config;


import church.morningclass.attendancemanager.model.helper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Mapper mapper() {
        return new Mapper();
    }
}
