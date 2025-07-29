package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.qingliangceshided.seven.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 15:57:33
 */
public class AlipayDataAiserviceQingliangceshidedSevenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4737634229926913726L;

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
