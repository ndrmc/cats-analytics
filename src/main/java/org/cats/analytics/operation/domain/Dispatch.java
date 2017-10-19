package org.cats.analytics.operation.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Dispatch {
    @Id
    private ObjectId id;
    private Long dispatchId;
    private String ginNo;
    private Long operationId;
    private String requisitionNumber;
    private Date dispatchDate;
    private Long fdpId;
    private Long woredaId;
    private Long zoneId;
    private Long regionId;
    private String fdpName;
    private String woredaName;
    private String zoneName;
    private String regionName;
    private String weightBridgeTicketNumber;
    private Long transporterId;
    private String transporterName;
    private String plateNumber;
    private String trailerPlateNumber;
    private String driverName;
    private String remark;
    private Boolean draft;
    private Long createdBy;
    private Long modifiedBy;
    private Boolean deleted;
    private Date deletedAt;
    private Date createdAt;
    private Date updatedAt;
    private Long hubId;
    private String hubName;
    private Long warehouseId;
    private String warehouseName;
    private String dispatchDateEc;
    private List<DispatchItem> dispatchItems;

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

    public String getGinNo() {
        return ginNo;
    }

    public void setGinNo(String ginNo) {
        this.ginNo = ginNo;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
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

    public Long getFdpId() {
        return fdpId;
    }

    public void setFdpId(Long fdpId) {
        this.fdpId = fdpId;
    }

    public Long getWoredaId() {
        return woredaId;
    }

    public void setWoredaId(Long woredaId) {
        this.woredaId = woredaId;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
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

    public Long getHubId() {
        return hubId;
    }

    public void setHubId(Long hubId) {
        this.hubId = hubId;
    }

    public String getHubName() {
        return hubName;
    }

    public void setHubName(String hubName) {
        this.hubName = hubName;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
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
