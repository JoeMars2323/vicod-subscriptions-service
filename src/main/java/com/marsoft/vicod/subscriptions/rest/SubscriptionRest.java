package com.marsoft.vicod.subscriptions.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionRest implements Serializable {

    private static final long serialVersionUID = 5846075757296731365L;

    private Long id;
    private String type;
    private BigDecimal price;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<ProfileRest> profiles;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<ProfileRest> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<ProfileRest> profiles) {
        this.profiles = profiles;
    }

    
    
	@Override
	public String toString() {
		return "SubscriptionRest [type=" + type + ", price=" + price + ", startDate=" + startDate + ", endDate="
				+ endDate + ", profiles=" + profiles + "]";
	}
    
    
    
}
