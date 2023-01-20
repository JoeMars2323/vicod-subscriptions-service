package com.marsoft.vicod.subscriptions.services;

import java.util.List;

import com.marsoft.vicod.subscriptions.rest.ProfileRest;

public interface ProfileService {
	
	public List<ProfileRest> getProfileById(Long profileId);

}
