package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.exit.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:31
 */
public class AntProdpaasProductExitCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 1444217419853559634L;

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
