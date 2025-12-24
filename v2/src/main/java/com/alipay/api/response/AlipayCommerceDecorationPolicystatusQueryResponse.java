package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.policystatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-22 14:30:49
 */
public class AlipayCommerceDecorationPolicystatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2497891914249385757L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 核保状态
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/** 
	 * <a href="https://render.alipay.com/p/h5/inspolicy/www/index.html?policyNo=保单单号">
	 */
	@ApiField("policy_url")
	private String policyUrl;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	public String getPolicyStatus( ) {
		return this.policyStatus;
	}

	public void setPolicyUrl(String policyUrl) {
		this.policyUrl = policyUrl;
	}
	public String getPolicyUrl( ) {
		return this.policyUrl;
	}

}
