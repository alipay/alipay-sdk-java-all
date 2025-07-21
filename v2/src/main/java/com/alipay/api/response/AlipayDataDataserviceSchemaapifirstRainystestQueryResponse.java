package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapifirst.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-15 11:20:32
 */
public class AlipayDataDataserviceSchemaapifirstRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3184682673978198334L;

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
