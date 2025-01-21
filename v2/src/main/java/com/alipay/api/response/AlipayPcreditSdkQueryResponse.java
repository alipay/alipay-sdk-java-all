package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.sdk.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 15:07:19
 */
public class AlipayPcreditSdkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1691333677381769561L;

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
