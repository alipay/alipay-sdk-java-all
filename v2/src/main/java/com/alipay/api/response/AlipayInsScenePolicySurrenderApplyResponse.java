package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.surrender.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:27:19
 */
public class AlipayInsScenePolicySurrenderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6159672966778745249L;

	/** 
	 * 蚂蚁保险平台生成的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}
