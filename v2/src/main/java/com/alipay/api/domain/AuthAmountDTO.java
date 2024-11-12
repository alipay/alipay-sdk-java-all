package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权金额信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 15:21:18
 */
public class AuthAmountDTO extends AlipayObject {

	private static final long serialVersionUID = 4393111861288646148L;

	/**
	 * 单位为：分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * ORDER_AMOUNT单笔金额
TOTAL_AMOUNT累计金额
	 */
	@ApiField("auth_factor")
	private String authFactor;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
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
