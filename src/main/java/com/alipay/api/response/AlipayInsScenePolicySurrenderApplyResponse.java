package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.surrender.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 12:00:35
 */
public class AlipayInsScenePolicySurrenderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4899614818486922651L;

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
