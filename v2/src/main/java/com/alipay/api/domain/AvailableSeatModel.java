package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可用的坐席模型
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:50
 */
public class AvailableSeatModel extends AlipayObject {

	private static final long serialVersionUID = 7681345291582592388L;

	/**
	 * 用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * clvUserId，非2088id
	 */
	@ApiField("clv_user_id")
	private String clvUserId;

	/**
	 * 并发
	 */
	@ApiField("concurrency")
	private String concurrency;

	/**
	 * 联系人id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 快照时间
	 */
	@ApiField("snap_shot_time")
	private String snapShotTime;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户1088id，非2088id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 工作的技能组id
	 */
	@ApiField("work_skill_group_id")
	private String workSkillGroupId;

	/**
	 * 工作状态
	 */
	@ApiField("work_status")
	private String workStatus;

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public String getClvUserId() {
		return this.clvUserId;
	}
	public void setClvUserId(String clvUserId) {
		this.clvUserId = clvUserId;
	}

	public String getConcurrency() {
		return this.concurrency;
	}
	public void setConcurrency(String concurrency) {
		this.concurrency = concurrency;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getSnapShotTime() {
		return this.snapShotTime;
	}
	public void setSnapShotTime(String snapShotTime) {
		this.snapShotTime = snapShotTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWorkSkillGroupId() {
		return this.workSkillGroupId;
	}
	public void setWorkSkillGroupId(String workSkillGroupId) {
		this.workSkillGroupId = workSkillGroupId;
	}

	public String getWorkStatus() {
		return this.workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

}
