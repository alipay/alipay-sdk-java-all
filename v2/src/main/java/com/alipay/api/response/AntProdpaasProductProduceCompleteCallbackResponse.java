package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.produce.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:04
 */
public class AntProdpaasProductProduceCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691164811356671572L;

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
