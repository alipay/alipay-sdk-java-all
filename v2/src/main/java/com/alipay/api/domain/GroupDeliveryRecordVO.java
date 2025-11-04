package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广计划记录
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:15:19
 */
public class GroupDeliveryRecordVO extends AlipayObject {

	private static final long serialVersionUID = 3414553144894468622L;

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

	/**
	 * 提示语
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 收款账号数
	 */
	@ApiField("total_count")
	private String totalCount;

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

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

}
