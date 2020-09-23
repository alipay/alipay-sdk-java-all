package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券营销信息
 *
 * @author auto create
 * @since 1.0, 2020-09-11 17:11:11
 */
public class PromoInfo extends AlipayObject {

	private static final long serialVersionUID = 7667771491212639747L;

	/**
	 * 最高优惠金额
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 代金券，券金额
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	/**
	 * 优惠额度，如3折券，reduction_ratio=0.7
	 */
	@ApiField("reduction_ratio")
	private String reductionRatio;

	/**
	 * 特价券减至金额
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
