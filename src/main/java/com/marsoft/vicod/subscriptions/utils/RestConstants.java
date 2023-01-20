package com.marsoft.vicod.subscriptions.utils;

public class RestConstants {

    public static final String APPLICATION_NAME = "/subscriptions-api";
    public static final String API_VERSION_1 = "/v1";

    public static final String SUBSCRIPTIONS = "/subscriptions";
    public static final String PROFILES = "/profiles";
    public static final String RESOURCE_PROFILE = "/subscriptions/{subscription-id}/profiles";    
    public static final String ID = "/{id}";

    private RestConstants() {
        throw new IllegalStateException("Utility Class");
    }
}
