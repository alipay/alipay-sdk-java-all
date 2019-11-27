package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.gongan.identity.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCertifyGonganIdentityCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3627457891445393293L;

	/** 
	 * 是否公安网验证通过。
true：验证通过 
false：验证不通过
	 */
	@ApiField("certify_result")
	private Boolean certifyResult;

	public void setCertifyResult(Boolean certifyResult) {
		this.certifyResult = certifyResult;
	}
	public Boolean getCertifyResult( ) {
		return this.certifyResult;
	}

}
