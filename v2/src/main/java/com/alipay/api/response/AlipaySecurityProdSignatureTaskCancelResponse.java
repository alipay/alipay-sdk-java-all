package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:52:35
 */
public class AlipaySecurityProdSignatureTaskCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6735416157866623834L;

	/** 
	 * 是否更新成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
