package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IsvAuthResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.isvauth.token.check response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 12:42:50
 */
public class AlipayCommerceMedicalIsvauthTokenCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2184761911866594824L;

	/** 
	 * 授权校验结果
	 */
	@ApiField("isv_auth_result")
	private IsvAuthResult isvAuthResult;

	public void setIsvAuthResult(IsvAuthResult isvAuthResult) {
		this.isvAuthResult = isvAuthResult;
	}
	public IsvAuthResult getIsvAuthResult( ) {
		return this.isvAuthResult;
	}

}
