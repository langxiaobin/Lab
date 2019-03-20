package com.lxb.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class ContractInfo {
    private Long serviceid;

    private String servicename;

    private Long contractid;

    private Integer quantity;

    private Integer servicecycles;

    private Byte status;

    private Date startdate;

    private Date enddate;

    private BigDecimal amount;

    private BigDecimal useamount;

    private BigDecimal currentamount;

    private BigDecimal creditamount;

    private BigDecimal compensationamount;

    private Boolean isupdate;

    private Long cmpserviceid;

    private Date createdon;

    private Date modifiedon;

    private Boolean hadsendemail;

    private String servicetype;

    private String servicereason;

    private Long parentserviceid;

    private String originalservicename;

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }

    public Long getContractid() {
        return contractid;
    }

    public void setContractid(Long contractid) {
        this.contractid = contractid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getServicecycles() {
        return servicecycles;
    }

    public void setServicecycles(Integer servicecycles) {
        this.servicecycles = servicecycles;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUseamount() {
        return useamount;
    }

    public void setUseamount(BigDecimal useamount) {
        this.useamount = useamount;
    }

    public BigDecimal getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(BigDecimal currentamount) {
        this.currentamount = currentamount;
    }

    public BigDecimal getCreditamount() {
        return creditamount;
    }

    public void setCreditamount(BigDecimal creditamount) {
        this.creditamount = creditamount;
    }

    public BigDecimal getCompensationamount() {
        return compensationamount;
    }

    public void setCompensationamount(BigDecimal compensationamount) {
        this.compensationamount = compensationamount;
    }

    public Boolean getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(Boolean isupdate) {
        this.isupdate = isupdate;
    }

    public Long getCmpserviceid() {
        return cmpserviceid;
    }

    public void setCmpserviceid(Long cmpserviceid) {
        this.cmpserviceid = cmpserviceid;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public Boolean getHadsendemail() {
        return hadsendemail;
    }

    public void setHadsendemail(Boolean hadsendemail) {
        this.hadsendemail = hadsendemail;
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    public String getServicereason() {
        return servicereason;
    }

    public void setServicereason(String servicereason) {
        this.servicereason = servicereason == null ? null : servicereason.trim();
    }

    public Long getParentserviceid() {
        return parentserviceid;
    }

    public void setParentserviceid(Long parentserviceid) {
        this.parentserviceid = parentserviceid;
    }

    public String getOriginalservicename() {
        return originalservicename;
    }

    public void setOriginalservicename(String originalservicename) {
        this.originalservicename = originalservicename == null ? null : originalservicename.trim();
    }
}