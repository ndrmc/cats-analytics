package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class RegionalRequestItem {
    @Id
    private ObjectId id;
    private Long regionalRequestId;
    private String regionalRequestName;
    private Long fdpId;
    private String fdpName;
    private Long numberOfBeneficiaries;
    private Long createdById;
    private String createdByName;
    private Long modifiedById;
    private String modifiedByName;
    private Date deletedAt;
    private Date createdAt;
    private Date modifiedAt;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getRegionalRequestId() {
        return regionalRequestId;
    }

    public void setRegionalRequestId(Long regionalRequestId) {
        this.regionalRequestId = regionalRequestId;
    }

    public String getRegionalRequestName() {
        return regionalRequestName;
    }

    public void setRegionalRequestName(String regionalRequestName) {
        this.regionalRequestName = regionalRequestName;
    }

    public Long getFdpId() {
        return fdpId;
    }

    public void setFdpId(Long fdpId) {
        this.fdpId = fdpId;
    }

    public String getFdpName() {
        return fdpName;
    }

    public void setFdpName(String fdpName) {
        this.fdpName = fdpName;
    }

    public Long getNumberOfBeneficiaries() {
        return numberOfBeneficiaries;
    }

    public void setNumberOfBeneficiaries(Long numberOfBeneficiaries) {
        this.numberOfBeneficiaries = numberOfBeneficiaries;
    }

    public Long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Long createdById) {
        this.createdById = createdById;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public Long getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(Long modifiedById) {
        this.modifiedById = modifiedById;
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
