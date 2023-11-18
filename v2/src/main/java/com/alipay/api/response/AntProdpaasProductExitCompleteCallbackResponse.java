package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.exit.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-17 21:01:49
 */
public class AntProdpaasProductExitCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 8395326133127221123L;

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
