package com.scaler.scalerschemedesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScalerSchemeDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScalerSchemeDesignApplication.class, args);
    }

}
//The application will throw error on first running as we have not connected to a database.
// In the resources folder , there is a file called application.properties. Here we write the information about the database

//MVC pattern
//M : Model , Entity in my system
// - Class which is persisted in the database
//There are three models , student , modules and exam. Make three classes for them.