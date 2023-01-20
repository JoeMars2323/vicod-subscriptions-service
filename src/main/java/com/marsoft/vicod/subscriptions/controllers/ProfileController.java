package com.marsoft.vicod.subscriptions.controllers;

import com.marsoft.vicod.subscriptions.rest.NetflixResponse;
import com.marsoft.vicod.subscriptions.rest.ProfileRest;
import com.marsoft.vicod.subscriptions.services.ProfileService;
import com.marsoft.vicod.subscriptions.utils.CommonConstants;
import com.marsoft.vicod.subscriptions.utils.RestConstants;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestConstants.PROFILES)
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }
    
    
    
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = RestConstants.ID, produces = MediaType.APPLICATION_JSON_VALUE)
	public NetflixResponse<List<ProfileRest>> getProfileById(@PathVariable Long id) {
    	return new NetflixResponse<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK),
                CommonConstants.OK, profileService.getProfileById(id));
	}
    
    
    
    
    
}
