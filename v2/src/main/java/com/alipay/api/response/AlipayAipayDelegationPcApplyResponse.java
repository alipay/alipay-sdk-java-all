package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.delegation.pc.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 15:37:58
 */
public class AlipayAipayDelegationPcApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1735963168796465586L;

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
