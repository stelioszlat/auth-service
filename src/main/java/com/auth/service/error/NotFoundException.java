package com.auth.service.error;

public class NotFoundEcception extends Exception {

    public NotFoundEcception(int status) {
        super();

        this.setStatus(status);
    }
}
