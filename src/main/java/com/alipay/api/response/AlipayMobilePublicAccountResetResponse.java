package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.reset response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-06 11:06:39
 */
public class AlipayMobilePublicAccountResetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1561596281588928874L;

	/** 
	 * 这是新账户绑定成功后产生的协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果信息
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
