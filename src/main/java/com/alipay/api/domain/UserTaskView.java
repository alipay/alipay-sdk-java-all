package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户领取的任务
 *
 * @author auto create
 * @since 1.0, 2019-05-30 11:54:29
 */
public class UserTaskView extends AlipayObject {

	private static final long serialVersionUID = 4543722628832389316L;

	/**
	 * 微客身份证号码。加密后的值
	 */
	@ApiField("identification")
	private String identification;

	/**
	 * 微客手机号码,在没有手机号的情况下，返回99999999999。加密后的值
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 劳务费,单位元
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 任务编号
	 */
	@ApiField("task_id")
	private Long taskId;

	/**
	 * 微客支付宝用户编号
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户任务id
	 */
	@ApiField("user_task_id")
	private String userTaskId;

	/**
	 * 微客用户编号
	 */
	@ApiField("weike_user_id")
	private Long weikeUserId;

	/**
	 * 微客用户名称，加密后的值
	 */
	@ApiField("weike_user_name")
	private String weikeUserName;

	public String getIdentification() {
		return this.identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getServiceCharge() {
		return this.serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserTaskId() {
		return this.userTaskId;
	}
	public void setUserTaskId(String userTaskId) {
		this.userTaskId = userTaskId;
	}

	public Long getWeikeUserId() {
		return this.weikeUserId;
	}
	public void setWeikeUserId(Long weikeUserId) {
		this.weikeUserId = weikeUserId;
	}

	public String getWeikeUserName() {
		return this.weikeUserName;
	}
	public void setWeikeUserName(String weikeUserName) {
		this.weikeUserName = weikeUserName;
	}

}
