package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子奖品结果
 *
 * @author auto create
 * @since 1.0, 2026-03-02 14:27:29
 */
public class SubPrizeResult extends AlipayObject {

	private static final long serialVersionUID = 8526233789452778391L;

	/**
	 * 以分为单位，比如599，代表5.99元的面额
	 */
	@ApiField("reduce_amount")
	private Long reduceAmount;

	/**
	 * 发放成功
	 */
	@ApiField("sub_prize_status")
	private String subPrizeStatus;

	/**
	 * 以分为单位，比如599，代表5.99元的门槛
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Long getReduceAmount() {
		return this.reduceAmount;
	}
	public void setReduceAmount(Long reduceAmount) {
		this.reduceAmount = reduceAmount;
	}

	public String getSubPrizeStatus() {
		return this.subPrizeStatus;
	}
	public void setSubPrizeStatus(String subPrizeStatus) {
		this.subPrizeStatus = subPrizeStatus;
	}

	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
