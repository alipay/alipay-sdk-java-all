package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.exit.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 13:49:57
 */
public class AntProdpaasProductExitCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264529895892737213L;

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
