package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 论坛活动入会核验信息同步
 *
 * @author auto create
 * @since 1.0, 2024-08-28 17:45:21
 */
public class AlipayOfflineProviderBundmeetingPassNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8891258997335771186L;

	/**
	 * 1、签入
2、签出
	 */
	@ApiField("action")
	private String action;

	/**
	 * 活动的id
	 */
	@ApiField("activity_uuid")
	private String activityUuid;

	/**
	 * 活动时段
	 */
	@ApiField("appoint_time_uuid")
	private String appointTimeUuid;

	/**
	 * 论坛的id
	 */
	@ApiField("forum_uuid")
	private String forumUuid;

	/**
	 * 额外信息
	 */
	@ApiField("other_info")
	private String otherInfo;

	/**
	 * 核验信息
	 */
	@ApiField("post_info")
	private String postInfo;

	/**
	 * 用于描述外滩大会入会场景
1、personnelPass （闸机入会人员通行进出场）
2、forumPass（论坛通行进出场记录）
3、activityPass（活动通行进出场记录）
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 成功、失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用于描述服务商入会人员的用户id
	 */
	@ApiField("uuid")
	private String uuid;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActivityUuid() {
		return this.activityUuid;
	}
	public void setActivityUuid(String activityUuid) {
		this.activityUuid = activityUuid;
	}

	public String getAppointTimeUuid() {
		return this.appointTimeUuid;
	}
	public void setAppointTimeUuid(String appointTimeUuid) {
		this.appointTimeUuid = appointTimeUuid;
	}

	public String getForumUuid() {
		return this.forumUuid;
	}
	public void setForumUuid(String forumUuid) {
		this.forumUuid = forumUuid;
	}

	public String getOtherInfo() {
		return this.otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getPostInfo() {
		return this.postInfo;
	}
	public void setPostInfo(String postInfo) {
		this.postInfo = postInfo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
