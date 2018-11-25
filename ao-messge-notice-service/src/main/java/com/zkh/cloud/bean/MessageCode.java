package com.zkh.cloud.bean;

import java.util.Date;

public class MessageCode {
    private Integer id;

    private String phone;

    private String email;

    private String code;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public MessageCode(String phone, String email, String code, Date createTime) {
		super();
		this.phone = phone;
		this.email = email;
		this.code = code;
		this.createTime = createTime;
	}
    
}