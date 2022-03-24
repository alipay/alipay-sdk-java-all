package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facepay.close response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-22 16:45:22
 */
public class AlipayCommerceEducateFacepayCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8612962164599776898L;

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
