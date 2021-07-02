package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 家人共享关系同步批量接口
 *
 * @author auto create
 * @since 1.0, 2021-01-20 01:12:53
 */
public class AlipayUserFamilyShareRelationsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7462189991852451715L;

	/**
	 * 共享关系过期时间
	 */
	@ApiField("expired_date")
	private Date expiredDate;

	/**
	 * 共享资源的内容，例如卡号、协议号
	 */
	@ApiField("resource_content")
	private String resourceContent;

	/**
	 * 共享关系接入资源
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 共享关系接入场景
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 共享账号的列表
	 */
	@ApiListField("sharing_user_ids")
	@ApiField("string")
	private List<String> sharingUserIds;

	/**
	 * 共享账号类型
ALIPAY 、HAVANA、ARCHIVE
	 */
	@ApiField("sharing_user_type")
	private String sharingUserType;

	/**
	 * 目标状态
	 */
	@ApiField("target_status")
	private Long targetStatus;

	/**
	 * 更新时间
	 */
	@ApiField("update_date")
	private Date updateDate;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 关系变更版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public Date getExpiredDate() {
		return this.expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getResourceContent() {
		return this.resourceContent;
	}
	public void setResourceContent(String resourceContent) {
		this.resourceContent = resourceContent;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public List<String> getSharingUserIds() {
		return this.sharingUserIds;
	}
	public void setSharingUserIds(List<String> sharingUserIds) {
		this.sharingUserIds = sharingUserIds;
	}

	public String getSharingUserType() {
		return this.sharingUserType;
	}
	public void setSharingUserType(String sharingUserType) {
		this.sharingUserType = sharingUserType;
	}

	public Long getTargetStatus() {
		return this.targetStatus;
	}
	public void setTargetStatus(Long targetStatus) {
		this.targetStatus = targetStatus;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
