package edu.gw.spring.crud.crudtaxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
@EnableJpaAuditing
public class CrudtaxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudtaxiApplication.class, args);
    }

}
