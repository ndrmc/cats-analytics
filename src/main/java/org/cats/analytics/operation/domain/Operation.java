package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Operation {
    @Id
    private ObjectId id;
    private Long operationId;
    private String name;
    private String description;
    private Long hrdId;
    private String hrdName;
    private Long programId;
    private String programName;
    private Long fscdAnnualPlanId;
    private String fscdAnnualPlanName;
    private Long year;
    private Long round;
    private String month;
    private Date expectedStart;
    private Date expectedEnd;
    private Date actualStart;
    private Date actualEnd;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private Long createdById;
    private String createdByName;
    private Long modifiedById;
    private String modifiedByName;
    private Date deletedAt;
    private List<RationItem> rationItems;
    private List<RegionalRequest> regionalRequests;
    private List<Requisition> requisitions;
    private List<Dispatch> dispatches;
    private List<Delivery> deliveries;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getHrdId() {
        return hrdId;
    }

    public void setHrdId(Long hrdId) {
        this.hrdId = hrdId;
    }

    public String getHrdName() {
        return hrdName;
    }

    public void setHrdName(String hrdName) {
        this.hrdName = hrdName;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Long getFscdAnnualPlanId() {
        return fscdAnnualPlanId;
    }

    public void setFscdAnnualPlanId(Long fscdAnnualPlanId) {
        this.fscdAnnualPlanId = fscdAnnualPlanId;
    }

    public String getFscdAnnualPlanName() {
        return fscdAnnualPlanName;
    }

    public void setFscdAnnualPlanName(String fscdAnnualPlanName) {
        this.fscdAnnualPlanName = fscdAnnualPlanName;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getRound() {
        return round;
    }

    public void setRound(Long round) {
        this.round = round;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getExpectedStart() {
        return expectedStart;
    }

    public void setExpectedStart(Date expectedStart) {
        this.expectedStart = expectedStart;
    }

    public Date getExpectedEnd() {
        return expectedEnd;
    }

    public void setExpectedEnd(Date expectedEnd) {
        this.expectedEnd = expectedEnd;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActualEnd() {
        return actualEnd;
    }

    public void setActualEnd(Date actualEnd) {
        this.actualEnd = actualEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    public List<RationItem> getRationItems() {
        return rationItems;
    }

    public void setRationItems(List<RationItem> rationItems) {
        this.rationItems = rationItems;
    }

    public List<RegionalRequest> getRegionalRequests() {
        return regionalRequests;
    }

    public void setRegionalRequests(List<RegionalRequest> regionalRequests) {
        this.regionalRequests = regionalRequests;
    }

    public List<Requisition> getRequisitions() {
        return requisitions;
    }

    public void setRequisitions(List<Requisition> requisitions) {
        this.requisitions = requisitions;
    }

    public List<Dispatch> getDispatches() {
        return dispatches;
    }

    public void setDispatches(List<Dispatch> dispatches) {
        this.dispatches = dispatches;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }
}
