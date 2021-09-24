package com.springproject.app.ws.mobileappws;

import com.springproject.app.ws.ui.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = UserController.class)
@SpringBootApplication
public class MobileAppWsApplication {

    public static void main(String[] args) {

        SpringApplication.run(MobileAppWsApplication.class, args);
    }

}
