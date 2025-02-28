package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.openapisdk.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 19:36:47
 */
public class AlipaySecurityDataOpenapisdkRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1143565833515396571L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

}
