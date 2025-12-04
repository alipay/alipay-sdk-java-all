package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车企联名会员任务回传
 *
 * @author auto create
 * @since 1.0, 2024-05-24 11:11:29
 */
public class AlipayEcoMycarUnionmemberTaskCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 7658533546689439577L;

	/**
	 * 操作类型Code，支持的操作类型咨询支持接入的BD/解决方案
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 车生活定义的车企ID，车企接入时咨询对应BD
	 */
	@ApiField("manufacturer_id")
	private String manufacturerId;

	/**
	 * 业务发生时间（如：实际任务完成时间）
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务类型Code，支持的任务类型咨询支持接入的BD/解决方案
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getManufacturerId() {
		return this.manufacturerId;
	}
	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
