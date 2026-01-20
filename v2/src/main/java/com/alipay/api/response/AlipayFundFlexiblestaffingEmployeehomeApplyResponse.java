package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.employeehome.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 17:42:48
 */
public class AlipayFundFlexiblestaffingEmployeehomeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4661623147644975896L;

	/** 
	 * 授权跳转链接
	 */
	@ApiField("apply_link")
	private String applyLink;

	/** 
	 * 跳转链接类型
	 */
	@ApiField("apply_link_type")
	private String applyLinkType;

	/** 
	 * 唯一标识token
	 */
	@ApiField("flow_token")
	private String flowToken;

	public void setApplyLink(String applyLink) {
		this.applyLink = applyLink;
	}
	public String getApplyLink( ) {
		return this.applyLink;
	}

	public void setApplyLinkType(String applyLinkType) {
		this.applyLinkType = applyLinkType;
	}
	public String getApplyLinkType( ) {
		return this.applyLinkType;
	}

	public void setFlowToken(String flowToken) {
		this.flowToken = flowToken;
	}
	public String getFlowToken( ) {
		return this.flowToken;
	}

}
