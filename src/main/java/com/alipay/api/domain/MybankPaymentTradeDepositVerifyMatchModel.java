package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款验证金额校验
 *
 * @author auto create
 * @since 1.0, 2019-12-10 21:49:37
 */
public class MybankPaymentTradeDepositVerifyMatchModel extends AlipayObject {

	private static final long serialVersionUID = 8515129854984742387L;

	/**
	 * 打款金额，单位：分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 打款验证ID
打款验证受理后生成的一个唯一标识
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
