package org.springlearn.springlearn;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SpringlearnApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringlearnApplication.class, args);

    }

}
