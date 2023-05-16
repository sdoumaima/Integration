package com.nw.dto.recruiter;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class RecruiterDto {
    private Long id;
    @JsonProperty("foundation_date")
    private String foundationDate;
    private String website;
    @JsonProperty("head_office")
    private String headOffice;
    private String services;
    private String bio;
    private String details;
    private String gouvernorat;
    @JsonProperty("section_title")
    private String sectionTitle;
    @JsonProperty("section_description")
    private String sectionDescription;
    private String city;
    @JsonProperty("is_sponsor")
    private boolean isSponsor;
}
