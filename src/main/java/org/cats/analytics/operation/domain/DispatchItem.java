package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;

public class DispatchItem {
    @Id
    private ObjectId id;
    private Long dispatchId;
    private Long commodityCategoryId;
    private String commodityCategoryName;
    private Long commodityId;
    private String commodityName;
    private BigDecimal quantity;
    private BigDecimal quantityMT;
    private Long projectId;
    private String projectName;
    private Long organizationId;
    private String organizationName;
    private Long created_by;
    private Long modified_by;
    private Boolean deleted;
    private Date deleted_at;
    private Date created_at;
    private Date updated_at;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Long dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Long getCommodityCategoryId() {
        return commodityCategoryId;
    }

    public void setCommodityCategoryId(Long commodityCategoryId) {
        this.commodityCategoryId = commodityCategoryId;
    }

    public String getCommodityCategoryName() {
        return commodityCategoryName;
    }

    public void setCommodityCategoryName(String commodityCategoryName) {
        this.commodityCategoryName = commodityCategoryName;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getQuantityMT() {
        return quantityMT;
    }

    public void setQuantityMT(BigDecimal quantityMT) {
        this.quantityMT = quantityMT;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Long created_by) {
        this.created_by = created_by;
    }

    public Long getModified_by() {
        return modified_by;
    }

    public void setModified_by(Long modified_by) {
        this.modified_by = modified_by;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
