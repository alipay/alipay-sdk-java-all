package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合并信息
 *
 * @author auto create
 * @since 1.0, 2026-07-08 11:52:56
 */
public class MergeInfoE extends AlipayObject {

	private static final long serialVersionUID = 6873814385321751137L;

	/**
	 * 合并优惠金额，单位：元
	 */
	@ApiField("merge_discount_amount")
	private String mergeDiscountAmount;

	/**
	 * 合并期数/月
	 */
	@ApiField("merge_period")
	private String mergePeriod;

	/**
	 * 	合并租金金额，单位：元
	 */
	@ApiField("merge_rent_amount")
	private String mergeRentAmount;

	/**
	 * 原始期数，月
	 */
	@ApiField("original_period")
	private String originalPeriod;

	public String getMergeDiscountAmount() {
		return this.mergeDiscountAmount;
	}
	public void setMergeDiscountAmount(String mergeDiscountAmount) {
		this.mergeDiscountAmount = mergeDiscountAmount;
	}

	public String getMergePeriod() {
		return this.mergePeriod;
	}
	public void setMergePeriod(String mergePeriod) {
		this.mergePeriod = mergePeriod;
	}

	public String getMergeRentAmount() {
		return this.mergeRentAmount;
	}
	public void setMergeRentAmount(String mergeRentAmount) {
		this.mergeRentAmount = mergeRentAmount;
	}

	public String getOriginalPeriod() {
		return this.originalPeriod;
	}
	public void setOriginalPeriod(String originalPeriod) {
		this.originalPeriod = originalPeriod;
	}

}
