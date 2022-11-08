package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费率
 *
 * @author auto create
 * @since 1.0, 2022-02-25 22:03:44
 */
public class ChargeRateDTO extends AlipayObject {

	private static final long serialVersionUID = 3624254121252743848L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 收费方式
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 固定费用
	 */
	@ApiField("fix_rate")
	private String fixRate;

	/**
	 * 上限
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 下限
	 */
	@ApiField("min_amount")
	private String minAmount;

	/**
	 * 费率类型
	 */
	@ApiField("rate_type")
	private String rateType;

	/**
	 * 费率
	 */
	@ApiField("ratio")
	private String ratio;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getFixRate() {
		return this.fixRate;
	}
	public void setFixRate(String fixRate) {
		this.fixRate = fixRate;
	}

	public String getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	public String getRateType() {
		return this.rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getRatio() {
		return this.ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

}
