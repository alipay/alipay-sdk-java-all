package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代驾动态调价信息
 *
 * @author auto create
 * @since 1.0, 2022-08-23 16:31:08
 */
public class DesignatedDrivingDynamicPrice extends AlipayObject {

	private static final long serialVersionUID = 3181945619793548639L;

	/**
	 * 调价金额
	 */
	@ApiField("dynamic_fee")
	private String dynamicFee;

	/**
	 * 动态条件倍数
	 */
	@ApiField("dynamic_rate")
	private String dynamicRate;

	/**
	 * 调价原因
	 */
	@ApiField("dynamic_reason")
	private String dynamicReason;

	/**
	 * 调价显示标题，可为空，由支付宝自定义
	 */
	@ApiField("dynamic_title")
	private String dynamicTitle;

	/**
	 * 加价的最大值，部分isv给的数据是加价最大值，部分isv给的是加价后的总金额
	 */
	@ApiField("fee_max")
	private String feeMax;

	/**
	 * 调价方式，1：金额   2：倍数
	 */
	@ApiField("fee_type")
	private Long feeType;

	public String getDynamicFee() {
		return this.dynamicFee;
	}
	public void setDynamicFee(String dynamicFee) {
		this.dynamicFee = dynamicFee;
	}

	public String getDynamicRate() {
		return this.dynamicRate;
	}
	public void setDynamicRate(String dynamicRate) {
		this.dynamicRate = dynamicRate;
	}

	public String getDynamicReason() {
		return this.dynamicReason;
	}
	public void setDynamicReason(String dynamicReason) {
		this.dynamicReason = dynamicReason;
	}

	public String getDynamicTitle() {
		return this.dynamicTitle;
	}
	public void setDynamicTitle(String dynamicTitle) {
		this.dynamicTitle = dynamicTitle;
	}

	public String getFeeMax() {
		return this.feeMax;
	}
	public void setFeeMax(String feeMax) {
		this.feeMax = feeMax;
	}

	public Long getFeeType() {
		return this.feeType;
	}
	public void setFeeType(Long feeType) {
		this.feeType = feeType;
	}

}
