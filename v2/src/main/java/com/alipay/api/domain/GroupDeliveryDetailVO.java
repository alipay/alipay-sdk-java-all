package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推广计划详情
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:17:09
 */
public class GroupDeliveryDetailVO extends AlipayObject {

	private static final long serialVersionUID = 1768529784619733163L;

	/**
	 * 审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 绑定场景
	 */
	@ApiField("bind_scene")
	private String bindScene;

	/**
	 * 推广计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 推广计划名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 推广结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 收款账号列表
	 */
	@ApiListField("group_accounts")
	@ApiField("group_account_v_o")
	private List<GroupAccountVO> groupAccounts;

	/**
	 * 群组id，表里唯一键，创建群组自动生成
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 定义群组分类，便于后台管理运营识别，可与设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 推广开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 推广状态
	 */
	@ApiField("status")
	private String status;

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBindScene() {
		return this.bindScene;
	}
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<GroupAccountVO> getGroupAccounts() {
		return this.groupAccounts;
	}
	public void setGroupAccounts(List<GroupAccountVO> groupAccounts) {
		this.groupAccounts = groupAccounts;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
