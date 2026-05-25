package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.delegation.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:13
 */
public class AlipayUserAgreementDelegationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6274584752773158972L;

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
