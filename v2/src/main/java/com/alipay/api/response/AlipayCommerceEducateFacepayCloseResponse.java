package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facepay.close response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-09 14:10:17
 */
public class AlipayCommerceEducateFacepayCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6252697775481532378L;

	/** 
	 * 关闭申请执行结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
