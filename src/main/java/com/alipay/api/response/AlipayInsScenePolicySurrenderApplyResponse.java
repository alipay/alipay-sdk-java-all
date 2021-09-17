package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.surrender.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-11 22:26:31
 */
public class AlipayInsScenePolicySurrenderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4242333834793223248L;

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
