package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.storeitem.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-06 10:20:21
 */
public class AlipayContentCommercialStoreitemDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8225852213991139325L;

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
