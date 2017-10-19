package org.cats.analytics.operation.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RationItem {
    @Id
    private String id;
    private int rationItemId;
    private int rationId;
    private String rationName;
    private int commodityId;
    private String commodityName;
    private Double amount;
    private int unitOfMeasureId;
    private String unitOfMeasureName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRationItemId() {
        return rationItemId;
    }

    public void setRationItemId(int rationItemId) {
        this.rationItemId = rationItemId;
    }

    public int getRationId() {
        return rationId;
    }

    public void setRationId(int rationId) {
        this.rationId = rationId;
    }

    public String getRationName() {
        return rationName;
    }

    public void setRationName(String rationName) {
        this.rationName = rationName;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getUnitOfMeasureId() {
        return unitOfMeasureId;
    }

    public void setUnitOfMeasureId(int unitOfMeasureId) {
        this.unitOfMeasureId = unitOfMeasureId;
    }

    public String getUnitOfMeasureName() {
        return unitOfMeasureName;
    }

    public void setUnitOfMeasureName(String unitOfMeasureName) {
        this.unitOfMeasureName = unitOfMeasureName;
    }
}
