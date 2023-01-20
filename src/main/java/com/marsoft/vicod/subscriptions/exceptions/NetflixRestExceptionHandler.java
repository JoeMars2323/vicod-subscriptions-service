package com.marsoft.vicod.subscriptions.exceptions;

import com.marsoft.vicod.subscriptions.rest.NetflixResponse;
import com.marsoft.vicod.subscriptions.utils.ExceptionConstants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@SuppressWarnings({"rawtypes", "unchecked"})
public class NetflixRestExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    public NetflixResponse unhandledErrors(HttpServletRequest request, Exception exception) {

        return new NetflixResponse(ExceptionConstants.ERROR,
                HttpStatus.INTERNAL_SERVER_ERROR.toString(), exception.getMessage());
    }

    @ResponseBody
    @SuppressWarnings("unused")
    @ExceptionHandler({NetflixException.class})
    public NetflixResponse handledException(final HttpServletRequest request,
            final HttpServletResponse response, final NetflixException exception) {

        return new NetflixResponse(ExceptionConstants.ERROR, String.valueOf(exception.getCode()),
                exception.getMessage(), exception.getErrorList());
    }
}
