package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.decoration.policy.cancel.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 10:07:45
 */
public class AlipayCommerceDecorationPolicyCancelApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4438677243562145623L;

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
	 * 核保状态
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/** 
	 * 退保请求流水号
	 */
	@ApiField("surrender_flow_no")
	private String surrenderFlowNo;

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

	public void setSurrenderFlowNo(String surrenderFlowNo) {
		this.surrenderFlowNo = surrenderFlowNo;
	}
	public String getSurrenderFlowNo( ) {
		return this.surrenderFlowNo;
	}

}
