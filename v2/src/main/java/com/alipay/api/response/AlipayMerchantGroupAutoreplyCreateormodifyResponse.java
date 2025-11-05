package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.autoreply.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:32:37
 */
public class AlipayMerchantGroupAutoreplyCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1884373138122759845L;

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
