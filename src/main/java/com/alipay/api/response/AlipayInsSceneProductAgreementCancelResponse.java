package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.agreement.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:17:05
 */
public class AlipayInsSceneProductAgreementCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8364121938696712149L;

	/** 
	 * 返回成功或者失败
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
