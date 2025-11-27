package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N作业任务相关信息，目前支持设备和点餐，支持后续扩展
 *
 * @author auto create
 * @since 1.0, 2025-07-24 10:23:38
 */
public class NTaskSceneDetail extends AlipayObject {

	private static final long serialVersionUID = 6873917546717271876L;

	/**
	 * 点位绑定资产id，线圈作业场景为tagId，设备作业场景为sn
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 状态的变更时间
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 操作人未脱敏支付宝登记的电话号码
	 */
	@ApiField("operator_contact_number")
	private String operatorContactNumber;

	/**
	 * 操作人未脱敏名称
	 */
	@ApiField("operator_name")
	private String operatorName;

	/**
	 * 点位id
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 关联绑定资产id，设备作业场景使用
	 */
	@ApiField("related_device_id")
	private String relatedDeviceId;

	/**
	 * 绑定状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 操作标识，绑定类型消息时为作业单据id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOperatorContactNumber() {
		return this.operatorContactNumber;
	}
	public void setOperatorContactNumber(String operatorContactNumber) {
		this.operatorContactNumber = operatorContactNumber;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getRelatedDeviceId() {
		return this.relatedDeviceId;
	}
	public void setRelatedDeviceId(String relatedDeviceId) {
		this.relatedDeviceId = relatedDeviceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
