package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-23 10:50:01
 */
public class AlipayMobilePublicAccountAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7153748979234246653L;

	/** 
	 * 账户添加成功，在支付宝与其对应的协议号。如果账户重复添加，接口保证幂等依然视为添加成功，返回此前该账户在支付宝对应的协议号。其他异常该字段不存在。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
