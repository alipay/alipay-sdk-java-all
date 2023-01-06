package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付费用详情视图
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:21:55
 */
public class CreditPayChargePricingVO extends AlipayObject {

	private static final long serialVersionUID = 1562155481843477363L;

	/**
	 * 实际费用，单位元
	 */
	@ApiField("actual_charge")
	private String actualCharge;

	/**
	 * 实际费率，小数形式
	 */
	@ApiField("actual_charge_rate")
	private String actualChargeRate;

	/**
	 * 费用CODE
	 */
	@ApiField("charge_code")
	private String chargeCode;

	/**
	 * 费用名目
	 */
	@ApiField("charge_name")
	private String chargeName;

	/**
	 * 原始费用，单位元
	 */
	@ApiField("origin_charge")
	private String originCharge;

	/**
	 * 原始费率，小数形式
	 */
	@ApiField("origin_charge_rate")
	private String originChargeRate;

	public String getActualCharge() {
		return this.actualCharge;
	}
	public void setActualCharge(String actualCharge) {
		this.actualCharge = actualCharge;
	}

	public String getActualChargeRate() {
		return this.actualChargeRate;
	}
	public void setActualChargeRate(String actualChargeRate) {
		this.actualChargeRate = actualChargeRate;
	}

	public String getChargeCode() {
		return this.chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public String getChargeName() {
		return this.chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}

	public String getOriginCharge() {
		return this.originCharge;
	}
	public void setOriginCharge(String originCharge) {
		this.originCharge = originCharge;
	}

	public String getOriginChargeRate() {
		return this.originChargeRate;
	}
	public void setOriginChargeRate(String originChargeRate) {
		this.originChargeRate = originChargeRate;
	}

}
