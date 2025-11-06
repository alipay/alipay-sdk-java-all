package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.policystatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-24 13:47:40
 */
public class AlipayCommerceDecorationPolicystatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8787713579254543854L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 核保状态
	 */
	@ApiField("policy_status")
	private String policyStatus;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyStatus( ) {
		return this.policyStatus;
	}

}
