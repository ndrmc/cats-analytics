package org.cats.analytics.operation.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class DispatchItem {
    @Id
    private String id;
    private int dispatchId;
    private int commodityCategoryId;
    private String commodityCategoryName;
    private int commodityId;
    private String commodityName;
    private float quantity;
    private int projectId;
    private String projectName;
    private int organizationId;
    private String organizationName;
    private int created_by;
    private int modified_by;
    private Boolean deleted;
    private Date deleted_at;
    private Date created_at;
    private Date updated_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(int dispatchId) {
        this.dispatchId = dispatchId;
    }

    public int getCommodityCategoryId() {
        return commodityCategoryId;
    }

    public void setCommodityCategoryId(int commodityCategoryId) {
        this.commodityCategoryId = commodityCategoryId;
    }

    public String getCommodityCategoryName() {
        return commodityCategoryName;
    }

    public void setCommodityCategoryName(String commodityCategoryName) {
        this.commodityCategoryName = commodityCategoryName;
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getModified_by() {
        return modified_by;
    }

    public void setModified_by(int modified_by) {
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
