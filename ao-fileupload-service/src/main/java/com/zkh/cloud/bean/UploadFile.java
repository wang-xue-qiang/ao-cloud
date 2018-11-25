package com.zkh.cloud.bean;

import java.util.Date;

public class UploadFile {
    private String id;

    private String url;

    private String userId;

    private Integer type;

    private Date createTime;
    public UploadFile(){}

	public UploadFile(String id,String url, String userId, Integer type,Date createTime) {
		super();
		this.id =id;
		this.url = url;
		this.userId = userId;
		this.type = type;
		this.createTime =createTime;
	}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}