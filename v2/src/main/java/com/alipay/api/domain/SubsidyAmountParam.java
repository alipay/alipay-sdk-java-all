package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充计算金额参数
 *
 * @author auto create
 * @since 1.0, 2023-08-24 11:35:49
 */
public class SubsidyAmountParam extends AlipayObject {

	private static final long serialVersionUID = 6164994384399575693L;

	/**
	 * 补充计算金额，必须大于0
	 */
	@ApiField("subsidy_amount")
	private String subsidyAmount;

	/**
	 * 补充金额计算模式
	 */
	@ApiField("subsidy_mode")
	private String subsidyMode;

	/**
	 * 补充金额类型
	 */
	@ApiField("subsidy_type")
	private String subsidyType;

	public String getSubsidyAmount() {
		return this.subsidyAmount;
	}
	public void setSubsidyAmount(String subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}

	public String getSubsidyMode() {
		return this.subsidyMode;
	}
	public void setSubsidyMode(String subsidyMode) {
		this.subsidyMode = subsidyMode;
	}

	public String getSubsidyType() {
		return this.subsidyType;
	}
	public void setSubsidyType(String subsidyType) {
		this.subsidyType = subsidyType;
	}

}
