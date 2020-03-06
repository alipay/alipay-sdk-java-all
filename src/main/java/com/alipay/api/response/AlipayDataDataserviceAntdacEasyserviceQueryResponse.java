package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdac.easyservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceAntdacEasyserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1311436979563716633L;

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
