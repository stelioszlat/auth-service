package com.auth.service.error;


import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorController {

    @ExceptionHandler({ Exception.class })
    public void handleException() {
        System.out.println("Internal Software Error");
    }
}
