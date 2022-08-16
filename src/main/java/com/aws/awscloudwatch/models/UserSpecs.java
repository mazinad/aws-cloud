package com.aws.awscloudwatch.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class UserSpecs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specsId;
    @Size(min = 10, max = 10)
    private String specsNumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date specsDate;

    public Long getSpecsId() {
        return specsId;
    }

    public void setSpecsId(Long specsId) {
        this.specsId = specsId;
    }

    public String getSpecsNumber() {
        return specsNumber;
    }

    public void setSpecsNumber(String specsNumber) {
        this.specsNumber = specsNumber;
    }

    public Date getSpecsDate() {
        return specsDate;
    }

    public void setSpecsDate(Date specsDate) {
        this.specsDate = specsDate;
    }
}
