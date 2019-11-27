package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.auth.hbcrowd.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 15:34:32
 */
public class AlipayPcreditHuabeiAuthHbcrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8734191993367165152L;

	/** 
	 * true:成功 false：失败
	 */
	@ApiField("auth_result")
	private Boolean authResult;

	public void setAuthResult(Boolean authResult) {
		this.authResult = authResult;
	}
	public Boolean getAuthResult( ) {
		return this.authResult;
	}

}
