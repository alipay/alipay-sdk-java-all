package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.simplest.policy.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 10:57:54
 */
public class AlipayInsSceneSimplestPolicyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8638535113511774838L;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 预下单ID
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}
	public String getPreOrderId( ) {
		return this.preOrderId;
	}

}
