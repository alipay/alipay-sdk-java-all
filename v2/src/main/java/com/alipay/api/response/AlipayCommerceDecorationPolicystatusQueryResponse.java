package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.policystatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 10:12:44
 */
public class AlipayCommerceDecorationPolicystatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7881258122974355829L;

	/** 
	 * 保司保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

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
	 * 枚举值：
核保受理:PENDING
核保成功:UNDERWRITING_SUCCESS
核保失败:UNDERWRITING_FAILURE
承保成功:POLICY_ISSUED_SUCCESS
承保失败:POLICY_ISSUED_FAILURE
已退保:POLICY_CANCELLED
退保受理:SURRENDER_PENDING
退保失败:SURRENDER_ FAILURE
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/** 
	 * <a href="https://render.alipay.com/p/h5/inspolicy/www/index.html?policyNo=保单单号">
	 */
	@ApiField("policy_url")
	private String policyUrl;

	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}
	public String getInstPolicyNo( ) {
		return this.instPolicyNo;
	}

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
