package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.storeitem.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 14:41:55
 */
public class AlipayContentCommercialStoreitemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1784596851381232982L;

	/** 
	 * 带货车商品移除
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
