package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.basic.router.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:47:40
 */
public class AlipayEcoBasicRouterSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1412758415225613957L;

	/** 
	 * 路由返回的数据
	 */
	@ApiField("res")
	private String res;

	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

}
