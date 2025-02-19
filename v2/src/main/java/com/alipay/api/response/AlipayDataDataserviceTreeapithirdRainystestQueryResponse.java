package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.treeapithird.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-10 14:45:36
 */
public class AlipayDataDataserviceTreeapithirdRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3687869557133293198L;

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
