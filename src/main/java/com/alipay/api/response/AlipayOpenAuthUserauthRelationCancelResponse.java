package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relation.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 10:01:22
 */
public class AlipayOpenAuthUserauthRelationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4399327152962533536L;

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
