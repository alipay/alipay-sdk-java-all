package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.autoreply.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:28
 */
public class AlipayMerchantGroupAutoreplyCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7183952821598914376L;

	/** 
	 * 自动回复id
	 */
	@ApiField("autoreply_id")
	private String autoreplyId;

	public void setAutoreplyId(String autoreplyId) {
		this.autoreplyId = autoreplyId;
	}
	public String getAutoreplyId( ) {
		return this.autoreplyId;
	}

}
