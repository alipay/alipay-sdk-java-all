package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员兑换积分
 *
 * @author auto create
 * @since 1.0, 2022-10-10 16:30:10
 */
public class AlipayCommerceYuntaskPointExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 5323353977276282571L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 商家id
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
