package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inst.policy.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 12:27:49
 */
public class AlipayInsSceneInstPolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6416875354199877466L;

	/** 
	 * 电子保单下载链接
	 */
	@ApiField("electronic_policy_url")
	private String electronicPolicyUrl;

	/** 
	 * 保司保单号
	 */
	@ApiField("inst_policy_no")
	private String instPolicyNo;

	public void setElectronicPolicyUrl(String electronicPolicyUrl) {
		this.electronicPolicyUrl = electronicPolicyUrl;
	}
	public String getElectronicPolicyUrl( ) {
		return this.electronicPolicyUrl;
	}

	public void setInstPolicyNo(String instPolicyNo) {
		this.instPolicyNo = instPolicyNo;
	}
	public String getInstPolicyNo( ) {
		return this.instPolicyNo;
	}

}
