package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
public class RequisitionItem {
    @Id
    private ObjectId id;
    private Long requisitionItemId;
    private Long fdpId;
    private String fdpName;
    private Long beneficiaryNo;
    private Long unitOfMeasureId;
    private String unitOfMeasureName;
    private BigDecimal amount;
    private BigDecimal amountMT;
    private BigDecimal contingency;
    private BigDecimal contingencyMT;
    private Date createdAt;
    private Date updatedAt;
    private Long createdById;
    private String createdByName;
    private Long modifiedById;
    private String modifiedByName;
    private Date deletedAt;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getRequisitionItemId() {
        return requisitionItemId;
    }

    public void setRequisitionItemId(Long requisitionItemId) {
        this.requisitionItemId = requisitionItemId;
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

    public Long getBeneficiaryNo() {
        return beneficiaryNo;
    }

    public void setBeneficiaryNo(Long beneficiaryNo) {
        this.beneficiaryNo = beneficiaryNo;
    }

    public Long getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(Long unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public String getUnitOfMeasureName() {
        return unitOfMeasureName;
    }

    public void setUnitOfMeasureName(String unitOfMeasureName) {
        this.unitOfMeasureName = unitOfMeasureName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountMT() {
        return amountMT;
    }

    public void setAmountMT(BigDecimal amountMT) {
        this.amountMT = amountMT;
    }

    public BigDecimal getContingency() {
        return contingency;
    }

    public void setContingency(BigDecimal contingency) {
        this.contingency = contingency;
    }

    public BigDecimal getContingencyMT() {
        return contingencyMT;
    }

    public void setContingencyMT(BigDecimal contingencyMT) {
        this.contingencyMT = contingencyMT;
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
}
