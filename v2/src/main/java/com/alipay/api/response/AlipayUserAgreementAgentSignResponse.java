package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.agent.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-26 10:42:56
 */
public class AlipayUserAgreementAgentSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732137692227593282L;

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
