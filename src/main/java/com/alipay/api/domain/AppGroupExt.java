package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * GroupId与APPID的关系等其他信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:36:49
 */
public class AppGroupExt extends AlipayObject {

	private static final long serialVersionUID = 1775336725542867755L;

	/**
	 * 多个描述GroupId关系的对象
	 */
	@ApiListField("app_group_relationship_ext")
	@ApiField("app_group_relationship_ext")
	private List<AppGroupRelationshipExt> appGroupRelationshipExt;

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
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * OID值
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 所属类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	public List<AppGroupRelationshipExt> getAppGroupRelationshipExt() {
		return this.appGroupRelationshipExt;
	}
	public void setAppGroupRelationshipExt(List<AppGroupRelationshipExt> appGroupRelationshipExt) {
		this.appGroupRelationshipExt = appGroupRelationshipExt;
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

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

}
