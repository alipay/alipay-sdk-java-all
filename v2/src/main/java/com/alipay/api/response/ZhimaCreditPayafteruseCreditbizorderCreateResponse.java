package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 15:22:30
 */
public class ZhimaCreditPayafteruseCreditbizorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1696978626788722615L;

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
