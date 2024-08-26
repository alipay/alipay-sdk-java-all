package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.entry.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-12 09:32:48
 */
public class AntProdpaasProductEntryCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 5659114196674687788L;

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
