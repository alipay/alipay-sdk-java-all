package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述了GroupId关系
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:27:17
 */
public class AppGroupRelationshipExt extends AlipayObject {

	private static final long serialVersionUID = 5526996759662543477L;

	/**
	 * APPID值
	 */
	@ApiField("app_number")
	private String appNumber;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * GROUPID值
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * ID值
	 */
	@ApiField("id")
	private String id;

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
