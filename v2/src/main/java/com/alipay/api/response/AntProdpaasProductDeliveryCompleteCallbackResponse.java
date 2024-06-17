package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.delivery.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:19
 */
public class AntProdpaasProductDeliveryCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 1344898798377553932L;

	/** 
	 * 状态码(success|failure)
	 */
	@ApiField("flag")
	private String flag;

	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getFlag( ) {
		return this.flag;
	}

}
