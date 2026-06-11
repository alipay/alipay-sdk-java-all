package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.agent.sign response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-27 16:07:44
 */
public class AlipayUserAgreementAgentSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 2631626941859118668L;

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
