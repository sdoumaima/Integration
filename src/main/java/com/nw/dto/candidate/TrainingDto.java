package com.nw.dto.candidate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;


@Data
public class TrainingDto {

    private Long id;
    @JsonProperty("center")
    private String center;
    @JsonProperty("start_date")
    private Date startDate;
    @JsonProperty("end_date")
    private Date endDate;
    private String diploma;

    @JsonProperty("candidate_id")
    private Integer candidateId;
}
