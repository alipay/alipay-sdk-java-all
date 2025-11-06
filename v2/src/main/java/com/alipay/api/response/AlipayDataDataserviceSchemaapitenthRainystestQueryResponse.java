package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapitenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:56
 */
public class AlipayDataDataserviceSchemaapitenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3199293384532675988L;

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
