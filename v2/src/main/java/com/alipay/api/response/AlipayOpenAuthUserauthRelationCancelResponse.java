package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relation.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:42:03
 */
public class AlipayOpenAuthUserauthRelationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 5679283235412318413L;

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
