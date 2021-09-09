package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券营销信息
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:25:26
 */
public class PromoInfo extends AlipayObject {

	private static final long serialVersionUID = 8118137592629117453L;

	/**
	 * 最高优惠金额，仅针对折扣券
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 券金额，仅针对代金券
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 优惠额度，如3折券，返回0.7，仅针对折扣券
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 减至金额，仅针对减至券
	 */
	@ApiField("specified_amount")
	private String specifiedAmount;

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

	public String getReductionRatio() {
		return this.reductionRatio;
	}
	public void setReductionRatio(String reductionRatio) {
		this.reductionRatio = reductionRatio;
	}

	public String getSpecifiedAmount() {
		return this.specifiedAmount;
	}
	public void setSpecifiedAmount(String specifiedAmount) {
		this.specifiedAmount = specifiedAmount;
	}

}
