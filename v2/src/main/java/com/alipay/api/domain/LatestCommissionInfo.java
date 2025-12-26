package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 最新抽佣信息
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:28
 */
public class LatestCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 4899137867193444198L;

	/**
	 * 最新比例，单位为百分比
	 */
	@ApiField("latest_rate")
	private String latestRate;

	/**
	 * 最新状态
	 */
	@ApiField("latest_status")
	private String latestStatus;

	public String getLatestRate() {
		return this.latestRate;
	}
	public void setLatestRate(String latestRate) {
		this.latestRate = latestRate;
	}

	public String getLatestStatus() {
		return this.latestStatus;
	}
	public void setLatestStatus(String latestStatus) {
		this.latestStatus = latestStatus;
	}

}
