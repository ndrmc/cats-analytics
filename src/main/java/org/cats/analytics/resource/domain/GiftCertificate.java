package org.cats.analytics.resource.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
public class GiftCertificate {
    @Id
    private Long id;
    private String referenceNo;
    private Date giftDate;
    private String vessel;
    private Long organizationId;
    private String organizationName;
    private Date eta;
    private Long programId;
    private String programName;
    private String portName;
    private Long statusId;
    private String statusName;
    private String customsDeclarationNo;
    private String year;
    private Date expiryDate;
    private Long fundTypeId;
    private String fundTypeName;
    private String accountNo;
    private String billOfLoadingNo;
    private BigDecimal amount;
    private BigDecimal estimatedTax;
    private BigDecimal estimatedPrice;
    private Long fundSourceId;
    private String fundSourceName;
    private Long currencyId;
    private String currencyName;
    private Long commodityId;
    private String commodityName;
    private String createdDate;
    private Long createdBy;
    private String createdByUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Date getGiftDate() {
        return giftDate;
    }

    public void setGiftDate(Date giftDate) {
        this.giftDate = giftDate;
    }

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
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

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
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

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCustomsDeclarationNo() {
        return customsDeclarationNo;
    }

    public void setCustomsDeclarationNo(String customsDeclarationNo) {
        this.customsDeclarationNo = customsDeclarationNo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getFundTypeId() {
        return fundTypeId;
    }

    public void setFundTypeId(Long fundTypeId) {
        this.fundTypeId = fundTypeId;
    }

    public String getFundTypeName() {
        return fundTypeName;
    }

    public void setFundTypeName(String fundTypeName) {
        this.fundTypeName = fundTypeName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBillOfLoadingNo() {
        return billOfLoadingNo;
    }

    public void setBillOfLoadingNo(String billOfLoadingNo) {
        this.billOfLoadingNo = billOfLoadingNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(BigDecimal estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public Long getFundSourceId() {
        return fundSourceId;
    }

    public void setFundSourceId(Long fundSourceId) {
        this.fundSourceId = fundSourceId;
    }

    public String getFundSourceName() {
        return fundSourceName;
    }

    public void setFundSourceName(String fundSourceName) {
        this.fundSourceName = fundSourceName;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }
}
