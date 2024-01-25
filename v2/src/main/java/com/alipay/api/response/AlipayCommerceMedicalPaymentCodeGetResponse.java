package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.code.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 14:01:55
 */
public class AlipayCommerceMedicalPaymentCodeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264982287837966773L;

	/** 
	 * 脱敏支付宝登录名
	 */
	@ApiField("login_name")
	private String loginName;

	/** 
	 * 用户付款码码值
	 */
	@ApiField("payment_code")
	private String paymentCode;

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName( ) {
		return this.loginName;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}
	public String getPaymentCode( ) {
		return this.paymentCode;
	}

}
