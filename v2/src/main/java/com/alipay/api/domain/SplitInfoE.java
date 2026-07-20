package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拆分信息
 *
 * @author auto create
 * @since 1.0, 2026-07-08 11:52:56
 */
public class SplitInfoE extends AlipayObject {

	private static final long serialVersionUID = 3158434839733755257L;

	/**
	 * 原始期数/月
	 */
	@ApiField("original_period")
	private Long originalPeriod;

	/**
	 * 拆后其它金额，单位：元
	 */
	@ApiField("split_other_amount")
	private String splitOtherAmount;

	/**
	 * 拆分期数
	 */
	@ApiField("split_period")
	private Long splitPeriod;

	/**
	 * 拆后租金金额，单位：元
	 */
	@ApiField("split_rent_amount")
	private String splitRentAmount;

	public Long getOriginalPeriod() {
		return this.originalPeriod;
	}
	public void setOriginalPeriod(Long originalPeriod) {
		this.originalPeriod = originalPeriod;
	}

	public String getSplitOtherAmount() {
		return this.splitOtherAmount;
	}
	public void setSplitOtherAmount(String splitOtherAmount) {
		this.splitOtherAmount = splitOtherAmount;
	}

	public Long getSplitPeriod() {
		return this.splitPeriod;
	}
	public void setSplitPeriod(Long splitPeriod) {
		this.splitPeriod = splitPeriod;
	}

	public String getSplitRentAmount() {
		return this.splitRentAmount;
	}
	public void setSplitRentAmount(String splitRentAmount) {
		this.splitRentAmount = splitRentAmount;
	}

}
