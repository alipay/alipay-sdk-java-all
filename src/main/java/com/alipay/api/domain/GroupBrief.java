package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交聊天群的概要信息
 *
 * @author auto create
 * @since 1.0, 2022-10-27 20:45:34
 */
public class GroupBrief extends AlipayObject {

	private static final long serialVersionUID = 6816516921836896423L;

	/**
	 * 群创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 群ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 群头像url
	 */
	@ApiField("group_img")
	private String groupImg;

	/**
	 * 群名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 群主id
	 */
	@ApiField("master_uid")
	private String masterUid;

	/**
	 * 商家open_id
	 */
	@ApiField("open_id")
	private String openId;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupImg() {
		return this.groupImg;
	}
	public void setGroupImg(String groupImg) {
		this.groupImg = groupImg;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getMasterUid() {
		return this.masterUid;
	}
	public void setMasterUid(String masterUid) {
		this.masterUid = masterUid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
