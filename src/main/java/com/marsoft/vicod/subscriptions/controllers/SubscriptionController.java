package com.marsoft.vicod.subscriptions.controllers;

import com.marsoft.vicod.subscriptions.rest.NetflixResponse;
import com.marsoft.vicod.subscriptions.rest.SubscriptionRest;
import com.marsoft.vicod.subscriptions.services.SubscriptionService;
import com.marsoft.vicod.subscriptions.utils.CommonConstants;
import com.marsoft.vicod.subscriptions.utils.RestConstants;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestConstants.SUBSCRIPTIONS)
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @Autowired
    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    
    
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public NetflixResponse<List<SubscriptionRest>> getAllSubscriptions() {
        return new NetflixResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK),
                CommonConstants.OK, subscriptionService.getAllSubscriptions());
    }
}
