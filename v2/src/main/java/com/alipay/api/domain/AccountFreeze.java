package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户冻结明细信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:42
 */
public class AccountFreeze extends AlipayObject {

	private static final long serialVersionUID = 4459567272632458263L;

	/**
	 * 冻结金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 冻结类型名称
	 */
	@ApiField("freeze_name")
	private String freezeName;

	/**
	 * 冻结类型值
	 */
	@ApiField("freeze_type")
	private String freezeType;

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getFreezeName() {
		return this.freezeName;
	}
	public void setFreezeName(String freezeName) {
		this.freezeName = freezeName;
	}

	public String getFreezeType() {
		return this.freezeType;
	}
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

}
