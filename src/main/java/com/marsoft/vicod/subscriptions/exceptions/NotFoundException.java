package com.marsoft.vicod.subscriptions.exceptions;

import java.util.Collections;
import org.springframework.http.HttpStatus;

public class NotFoundException extends NetflixException {

    private static final long serialVersionUID = -7399444852063737770L;

    public NotFoundException(final String message) {
        super(HttpStatus.NOT_FOUND.value(), message);
    }

    public NotFoundException(final String message, final ErrorDto data) {
        super(HttpStatus.NOT_FOUND.value(), message, Collections.singletonList(data));
    }
}
