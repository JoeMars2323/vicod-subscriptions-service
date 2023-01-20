package com.marsoft.vicod.subscriptions.services;

import java.util.List;

import com.marsoft.vicod.subscriptions.rest.SubscriptionRest;

public interface SubscriptionService {

    public List<SubscriptionRest> getAllSubscriptions();
}
