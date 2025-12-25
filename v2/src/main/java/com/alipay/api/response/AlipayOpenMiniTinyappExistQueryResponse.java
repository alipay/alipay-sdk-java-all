package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tinyapp.exist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 13:57:35
 */
public class AlipayOpenMiniTinyappExistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5177142795922555691L;

	/** 
	 * 是否是小程序开发者
	 */
	@ApiField("exist_mini")
	private String existMini;

	public void setExistMini(String existMini) {
		this.existMini = existMini;
	}
	public String getExistMini( ) {
		return this.existMini;
	}

}
