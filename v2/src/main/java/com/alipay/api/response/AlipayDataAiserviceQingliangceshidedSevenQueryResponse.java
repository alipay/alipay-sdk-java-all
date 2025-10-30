package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.qingliangceshided.seven.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-20 12:28:28
 */
public class AlipayDataAiserviceQingliangceshidedSevenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2753972346848496938L;

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
