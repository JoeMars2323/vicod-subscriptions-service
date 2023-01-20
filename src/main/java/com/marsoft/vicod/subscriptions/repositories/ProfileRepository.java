package com.marsoft.vicod.subscriptions.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marsoft.vicod.subscriptions.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
	
	List<Profile> findProfileById(Long profileId);

}
