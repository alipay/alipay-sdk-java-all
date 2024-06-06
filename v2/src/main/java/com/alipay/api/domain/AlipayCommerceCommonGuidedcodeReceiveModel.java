package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客获取推广码
 *
 * @author auto create
 * @since 1.0, 2023-12-25 17:28:51
 */
public class AlipayCommerceCommonGuidedcodeReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 6629257954291419313L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员openId
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 代运营商户Id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 淘客领取任务实例id,等于taskInstanceId
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
