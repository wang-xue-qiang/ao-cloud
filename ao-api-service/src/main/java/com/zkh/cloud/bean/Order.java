package com.zkh.cloud.bean;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;

    private String orderNo;

    private String userId;

    private String serviceId;

    private Integer state;

    private String contact;

    private String contactMobile;

    private String province;

    private String city;

    private String district;

    private String road;

    private String serviceBatch;

    private Date appointTime;

    private String remark;

    private Date endDate;

    private Date startDate;

    private Integer times;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private String remarks;

    private String delFlag;

    private Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getServiceBatch() {
        return serviceBatch;
    }

    public void setServiceBatch(String serviceBatch) {
        this.serviceBatch = serviceBatch == null ? null : serviceBatch.trim();
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", userId=" + userId + ", serviceId=" + serviceId
				+ ", state=" + state + ", contact=" + contact + ", contactMobile=" + contactMobile + ", province="
				+ province + ", city=" + city + ", district=" + district + ", road=" + road + ", serviceBatch="
				+ serviceBatch + ", appointTime=" + appointTime + ", remark=" + remark + ", endDate=" + endDate
				+ ", startDate=" + startDate + ", times=" + times + ", createBy=" + createBy + ", createDate="
				+ createDate + ", updateBy=" + updateBy + ", remarks=" + remarks + ", delFlag=" + delFlag
				+ ", updateDate=" + updateDate + "]";
	}
    
	public Order(){}

	public Order(String id, String remarks) {
		super();
		this.id = id;
		this.remarks = remarks;
	}
	
}