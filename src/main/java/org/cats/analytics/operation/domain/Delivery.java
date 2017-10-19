package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Delivery {
    @Id
    private ObjectId id;
    private String receivingNo;
    private Long transporterId;
    private String transporterName;
    private Long fdpId;
    private String fdpName;
    private String ginNumber;
    private Long receivedById;
    private String receivedByName;
    private Date receivedDate;
    private String status;
    private Long operationId;
    private String operationName;
    private String remark;
    private String draft;
    private Long createdById;
    private String createdByName;
    private Long modifiedById;
    private String modifiedByName;
    private Boolean deleted;
    private Date deletedAt;
    private Date createdAt;
    private Date updatedAt;
    private List<DeliveryItem> deliveryItems;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getReceivingNo() {
        return receivingNo;
    }

    public void setReceivingNo(String receivingNo) {
        this.receivingNo = receivingNo;
    }

    public Long getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(Long transporterId) {
        this.transporterId = transporterId;
    }

    public String getTransporterName() {
        return transporterName;
    }

    public void setTransporterName(String transporterName) {
        this.transporterName = transporterName;
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

    public String getGinNumber() {
        return ginNumber;
    }

    public void setGinNumber(String ginNumber) {
        this.ginNumber = ginNumber;
    }

    public Long getReceivedById() {
        return receivedById;
    }

    public void setReceivedById(Long receivedById) {
        this.receivedById = receivedById;
    }

    public String getReceivedByName() {
        return receivedByName;
    }

    public void setReceivedByName(String receivedByName) {
        this.receivedByName = receivedByName;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<DeliveryItem> getDeliveryItems() {
        return deliveryItems;
    }

    public void setDeliveryItems(List<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }
}
