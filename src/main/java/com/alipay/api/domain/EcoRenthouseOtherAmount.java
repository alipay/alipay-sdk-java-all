package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房平台其他费用
 *
 * @author auto create
 * @since 1.0, 2017-08-02 14:51:23
 */
public class EcoRenthouseOtherAmount extends AlipayObject {

	private static final long serialVersionUID = 2486897152245367861L;

	/**
	 * 30
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 费用单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
