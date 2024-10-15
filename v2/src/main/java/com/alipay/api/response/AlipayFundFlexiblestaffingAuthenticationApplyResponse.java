package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.authentication.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-09 10:59:31
 */
public class AlipayFundFlexiblestaffingAuthenticationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6247848937164174586L;

	/** 
	 * 授权跳转链接，具体内容类型根据authorize_link_type识别
	 */
	@ApiField("apply_link")
	private String applyLink;

	/** 
	 * 申请的流程实例ID，注意：同outBizNo也会申请到不同的流程实例
	 */
	@ApiField("flow_token")
	private String flowToken;

	public void setApplyLink(String applyLink) {
		this.applyLink = applyLink;
	}
	public String getApplyLink( ) {
		return this.applyLink;
	}

	public void setFlowToken(String flowToken) {
		this.flowToken = flowToken;
	}
	public String getFlowToken( ) {
		return this.flowToken;
	}

}
