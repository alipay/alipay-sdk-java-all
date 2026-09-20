package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.delegation.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 14:22:56
 */
public class AlipayUserAgreementDelegationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6836382512663224772L;

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
