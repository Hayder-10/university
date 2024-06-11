package tn.esprit.workshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class WorkshopspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopspringApplication.class, args);
    }

}
