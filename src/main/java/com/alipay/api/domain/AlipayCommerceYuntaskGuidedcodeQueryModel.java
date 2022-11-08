package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询导购员的推广码
 *
 * @author auto create
 * @since 1.0, 2022-11-07 16:02:49
 */
public class AlipayCommerceYuntaskGuidedcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4639788149524296664L;

	/**
	 * 导购员ID
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员ID
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 零售商的pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
