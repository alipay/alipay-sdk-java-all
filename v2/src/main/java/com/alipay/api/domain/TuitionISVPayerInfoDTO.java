package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费-付款人信息
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:52:47
 */
public class TuitionISVPayerInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4588759698371568432L;

	/**
	 * 支付宝登录号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 付款人身份证号
	 */
	@ApiField("payer_identity_card_number")
	private String payerIdentityCardNumber;

	/**
	 * 付款人支付宝绑定的手机号
	 */
	@ApiField("payer_phone_number")
	private String payerPhoneNumber;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getPayerIdentityCardNumber() {
		return this.payerIdentityCardNumber;
	}
	public void setPayerIdentityCardNumber(String payerIdentityCardNumber) {
		this.payerIdentityCardNumber = payerIdentityCardNumber;
	}

	public String getPayerPhoneNumber() {
		return this.payerPhoneNumber;
	}
	public void setPayerPhoneNumber(String payerPhoneNumber) {
		this.payerPhoneNumber = payerPhoneNumber;
	}

}
