package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tinyapp.exist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-13 17:15:36
 */
public class AlipayOpenMiniTinyappExistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2421541123364226546L;

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
