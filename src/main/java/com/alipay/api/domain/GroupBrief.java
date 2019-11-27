package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社交聊天群的概要信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 20:59:29
 */
public class GroupBrief extends AlipayObject {

	private static final long serialVersionUID = 2868613922131835112L;

	/**
	 * 创建者用户id
	 */
	@ApiField("creator_uid")
	private String creatorUid;

	/**
	 * 群创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 当前群人数
	 */
	@ApiField("group_count")
	private Long groupCount;

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
	 * 群类型
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 群主id
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

	public Long getGroupCount() {
		return this.groupCount;
	}
	public void setGroupCount(Long groupCount) {
		this.groupCount = groupCount;
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
