package com.zkh.cloud.bean;

import java.util.Date;

public class Customer {
    private String id;

    private Integer enable;

    private String cusName;

    private String cusNo;

    private Long industry;

    private String cusProvince;

    private String cusCity;

    private String cusDistrict;

    private String cusRoad;

    private Long level;

    private Long nature;

    private String contact;

    private String mobile;

    private String telephone;

    private String fax;

    private String email;

    private Long payment;

    private String userId;

    private String remark;

    private String staffId;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private String remarks;

    private String delFlag;

    private Date updateDate;

    private String staffName;

    private String staffTel;

    private String name ;
    
    private String value;
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusNo() {
        return cusNo;
    }

    public void setCusNo(String cusNo) {
        this.cusNo = cusNo == null ? null : cusNo.trim();
    }

    public Long getIndustry() {
        return industry;
    }

    public void setIndustry(Long industry) {
        this.industry = industry;
    }

    public String getCusProvince() {
        return cusProvince;
    }

    public void setCusProvince(String cusProvince) {
        this.cusProvince = cusProvince == null ? null : cusProvince.trim();
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity == null ? null : cusCity.trim();
    }

    public String getCusDistrict() {
        return cusDistrict;
    }

    public void setCusDistrict(String cusDistrict) {
        this.cusDistrict = cusDistrict == null ? null : cusDistrict.trim();
    }

    public String getCusRoad() {
        return cusRoad;
    }

    public void setCusRoad(String cusRoad) {
        this.cusRoad = cusRoad == null ? null : cusRoad.trim();
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getNature() {
        return nature;
    }

    public void setNature(Long nature) {
        this.nature = nature;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel == null ? null : staffTel.trim();
    }
}