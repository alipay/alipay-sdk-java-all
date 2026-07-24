package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.delegation.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-16 17:02:54
 */
public class AlipayUserAgreementDelegationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2256253637928854979L;

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
