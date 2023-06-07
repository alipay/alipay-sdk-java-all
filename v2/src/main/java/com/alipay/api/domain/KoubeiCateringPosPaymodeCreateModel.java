package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增支付方式
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:29:49
 */
public class KoubeiCateringPosPaymodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4833665972879367236L;

	/**
	 * 固定面额
	 */
	@ApiField("fixed_amount")
	private String fixedAmount;

	/**
	 * 是否固定面额（false:否；true:是）
	 */
	@ApiField("fixed_switch")
	private Boolean fixedSwitch;

	/**
	 * 计入实收比例
	 */
	@ApiField("income_ratio")
	private String incomeRatio;

	/**
	 * 支付方式名称
	 */
	@ApiField("pay_name")
	private String payName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getFixedAmount() {
		return this.fixedAmount;
	}
	public void setFixedAmount(String fixedAmount) {
		this.fixedAmount = fixedAmount;
	}

	public Boolean getFixedSwitch() {
		return this.fixedSwitch;
	}
	public void setFixedSwitch(Boolean fixedSwitch) {
		this.fixedSwitch = fixedSwitch;
	}

	public String getIncomeRatio() {
		return this.incomeRatio;
	}
	public void setIncomeRatio(String incomeRatio) {
		this.incomeRatio = incomeRatio;
	}

	public String getPayName() {
		return this.payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
