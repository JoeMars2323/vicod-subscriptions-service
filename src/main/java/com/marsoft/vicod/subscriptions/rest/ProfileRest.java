package com.marsoft.vicod.subscriptions.rest;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileRest implements Serializable {

    private static final long serialVersionUID = 6462127406898048192L;
    
	private Long id;
    private String name;
    private String alias;
    private String avatar;
   	
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
    
    
    @Override
	public String toString() {
		return "ProfileRest [name=" + name + ", alias=" + alias + ", avatar=" + avatar + "]";
	}
    
    
    
    
}
