package org.cats.analytics.operation.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Dispatch {
    @Id
    private String id;
    private String ginNo;
    private int operationId;
    private String requisitionNumber;
    private Date dispatchDate;
    private int fdpId;
    private int woredaId;
    private int zoneId;
    private int regionId;
    private String fdpName;
    private String woredaName;
    private String zoneName;
    private String regionName;
    private String weightBridgeTicketNumber;
    private int transporterId;
    private String transporterName;
    private String plateNumber;
    private String trailerPlateNumber;
    private String driverName;
    private String remark;
    private Boolean draft;
    private int createdBy;
    private int modifiedBy;
    private Boolean deleted;
    private Date deletedAt;
    private Date createdAt;
    private Date updatedAt;
    private int hubId;
    private String hubName;
    private int warehouseId;
    private String warehouseName;
    private String dispatchDateEc;
    private List<DispatchItem> dispatchItems;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGinNo() {
        return ginNo;
    }

    public void setGinNo(String ginNo) {
        this.ginNo = ginNo;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    public void setRequisitionNumber(String requisitionNumber) {
        this.requisitionNumber = requisitionNumber;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public int getFdpId() {
        return fdpId;
    }

    public void setFdpId(int fdpId) {
        this.fdpId = fdpId;
    }

    public int getWoredaId() {
        return woredaId;
    }

    public void setWoredaId(int woredaId) {
        this.woredaId = woredaId;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getFdpName() {
        return fdpName;
    }

    public void setFdpName(String fdpName) {
        this.fdpName = fdpName;
    }

    public String getWoredaName() {
        return woredaName;
    }

    public void setWoredaName(String woredaName) {
        this.woredaName = woredaName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getWeightBridgeTicketNumber() {
        return weightBridgeTicketNumber;
    }

    public void setWeightBridgeTicketNumber(String weightBridgeTicketNumber) {
        this.weightBridgeTicketNumber = weightBridgeTicketNumber;
    }

    public int getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(int transporterId) {
        this.transporterId = transporterId;
    }

    public String getTransporterName() {
        return transporterName;
    }

    public void setTransporterName(String transporterName) {
        this.transporterName = transporterName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getTrailerPlateNumber() {
        return trailerPlateNumber;
    }

    public void setTrailerPlateNumber(String trailerPlateNumber) {
        this.trailerPlateNumber = trailerPlateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = modifiedBy;
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

    public int getHubId() {
        return hubId;
    }

    public void setHubId(int hubId) {
        this.hubId = hubId;
    }

    public String getHubName() {
        return hubName;
    }

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getDispatchDateEc() {
        return dispatchDateEc;
    }

    public void setDispatchDateEc(String dispatchDateEc) {
        this.dispatchDateEc = dispatchDateEc;
    }

    public List<DispatchItem> getDispatchItems() {
        return dispatchItems;
    }

    public void setDispatchItems(List<DispatchItem> dispatchItems) {
        this.dispatchItems = dispatchItems;
    }
}
