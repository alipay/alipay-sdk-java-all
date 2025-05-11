package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流作业平台作业单风控信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 10:29:42
 */
public class LogisticsWorkOrderRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 1439583995343597186L;

	/**
	 * 风控完成时间
	 */
	@ApiField("check_time")
	private String checkTime;

	/**
	 * 风控失败原因，如果风控成功，该值为空
	 */
	@ApiField("fail_reason")
	private String failReason;

	public String getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

}
