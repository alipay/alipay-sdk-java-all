package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iifaadid.bio.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:47:39
 */
public class AlipaySecurityProdIifaadidBioApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2769431952178816978L;

	/** 
	 * 响应结果数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
