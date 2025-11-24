package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随机立减优惠规则
 *
 * @author auto create
 * @since 1.0, 2025-06-14 18:32:46
 */
public class RndBenefitRule extends AlipayObject {

	private static final long serialVersionUID = 4641394647966233312L;

	/**
	 * 最大优惠
	 */
	@ApiField("max_benefit")
	private String maxBenefit;

	/**
	 * 最小优惠
	 */
	@ApiField("min_benefit")
	private String minBenefit;

	/**
	 * 该优惠区间所占比例,精度向下取整保留到两位小数，例如 0.01% 中的0.01
	 */
	@ApiField("proportion")
	private String proportion;

	public String getMaxBenefit() {
		return this.maxBenefit;
	}
	public void setMaxBenefit(String maxBenefit) {
		this.maxBenefit = maxBenefit;
	}

	public String getMinBenefit() {
		return this.minBenefit;
	}
	public void setMinBenefit(String minBenefit) {
		this.minBenefit = minBenefit;
	}

	public String getProportion() {
		return this.proportion;
	}
	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

}
