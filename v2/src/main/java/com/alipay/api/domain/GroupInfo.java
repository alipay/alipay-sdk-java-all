package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群信息
 *
 * @author auto create
 * @since 1.0, 2017-08-15 14:39:54
 */
public class GroupInfo extends AlipayObject {

	private static final long serialVersionUID = 1732354744475781839L;

	/**
	 * 创建者用户id
	 */
	@ApiField("creator_uid")
	private String creatorUid;

	/**
	 * 创建时间
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
	 * 群成员上限
	 */
	@ApiField("group_threshold")
	private Long groupThreshold;

	/**
	 * 群类型,0:普通群、1：经费群、5：活动群、6：娱乐群
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 群主用户id
	 */
	@ApiField("master_uid")
	private String masterUid;

	public String getCreatorUid() {
		return this.creatorUid;
	}
	public void setCreatorUid(String creatorUid) {
		this.creatorUid = creatorUid;
	}

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

	public Long getGroupThreshold() {
		return this.groupThreshold;
	}
	public void setGroupThreshold(Long groupThreshold) {
		this.groupThreshold = groupThreshold;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getMasterUid() {
		return this.masterUid;
	}
	public void setMasterUid(String masterUid) {
		this.masterUid = masterUid;
	}

}
