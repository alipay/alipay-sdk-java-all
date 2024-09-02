package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权金额信息
 *
 * @author auto create
 * @since 1.0, 2024-04-11 16:35:49
 */
public class OpenApiAuthAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 7462897892944149697L;

	/**
	 * 授权金额的数值，单位为：分.
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 授权因子
	 */
	@ApiField("auth_factor")
	private String authFactor;

	/**
	 * 授权金额的币种
	 */
	@ApiField("currency")
	private String currency;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthFactor() {
		return this.authFactor;
	}
	public void setAuthFactor(String authFactor) {
		this.authFactor = authFactor;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
