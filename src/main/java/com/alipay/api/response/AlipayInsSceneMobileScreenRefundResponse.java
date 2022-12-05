package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.mobile.screen.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-04 09:56:07
 */
public class AlipayInsSceneMobileScreenRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4488974754661647822L;

	/** 
	 * 退保保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 退保保费
	 */
	@ApiField("surrender_premium")
	private String surrenderPremium;

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setSurrenderPremium(String surrenderPremium) {
		this.surrenderPremium = surrenderPremium;
	}
	public String getSurrenderPremium( ) {
		return this.surrenderPremium;
	}

}
