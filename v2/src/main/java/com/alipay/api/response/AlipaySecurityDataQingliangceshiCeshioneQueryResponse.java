package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.qingliangceshi.ceshione.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-20 12:29:00
 */
public class AlipaySecurityDataQingliangceshiCeshioneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6259298111944575129L;

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
