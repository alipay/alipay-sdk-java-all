package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.delegation.pc.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 16:07:16
 */
public class AlipayAipayDelegationPcApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1881792284923426586L;

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
