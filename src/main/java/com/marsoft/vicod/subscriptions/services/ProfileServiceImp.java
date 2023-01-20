package com.marsoft.vicod.subscriptions.services;

import com.marsoft.vicod.subscriptions.repositories.ProfileRepository;
import com.marsoft.vicod.subscriptions.rest.ProfileRest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImp implements ProfileService {

    private final ProfileRepository profileRepository;
    
    private ModelMapper modelMapper = new ModelMapper();
    

    @Autowired
    public ProfileServiceImp(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }
    
    
    @Override
	public List<ProfileRest> getProfileById(Long profileId) {
		return profileRepository.findProfileById(profileId).stream()
				.map(profile -> modelMapper.map(profile, ProfileRest.class)).collect(Collectors.toList());
	}
}
