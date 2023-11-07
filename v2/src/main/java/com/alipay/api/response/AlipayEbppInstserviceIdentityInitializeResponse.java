package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.identity.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:41:48
 */
public class AlipayEbppInstserviceIdentityInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5177561139186789941L;

	/** 
	 * 扩展字段（JSON格式）
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 核身字符串
	 */
	@ApiField("verify_id")
	private String verifyId;

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}
	public String getVerifyId( ) {
		return this.verifyId;
	}

}
