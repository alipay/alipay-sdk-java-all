package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relation.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:43:03
 */
public class AlipayOpenAuthUserauthRelationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2546896254353848428L;

	/** 
	 * 操作结果，成功or失败
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
