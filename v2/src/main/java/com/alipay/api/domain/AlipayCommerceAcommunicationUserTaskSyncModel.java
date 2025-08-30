package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商用户主动任务完成信息同步
 *
 * @author auto create
 * @since 1.0, 2024-05-07 15:54:15
 */
public class AlipayCommerceAcommunicationUserTaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8412573819978416166L;

	/**
	 * 用户完成任务的渠道
	 */
	@ApiField("chinfo")
	private String chinfo;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户完成的任务
	 */
	@ApiField("task_type")
	private String taskType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getChinfo() {
		return this.chinfo;
	}
	public void setChinfo(String chinfo) {
		this.chinfo = chinfo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
