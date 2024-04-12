package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户账户信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:42
 */
public class AlipayAccount extends AlipayObject {

	private static final long serialVersionUID = 5591732714475584982L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 不可用余额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 余额总额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
