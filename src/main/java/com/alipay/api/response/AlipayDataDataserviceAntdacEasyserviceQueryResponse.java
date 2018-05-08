package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdac.easyservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-11 18:57:11
 */
public class AlipayDataDataserviceAntdacEasyserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8329896816631137156L;

	/** 
	 * 方法返回值＋json字符串格式
	 */
	@ApiField("ret_val")
	private String retVal;

	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}
	public String getRetVal( ) {
		return this.retVal;
	}

}
