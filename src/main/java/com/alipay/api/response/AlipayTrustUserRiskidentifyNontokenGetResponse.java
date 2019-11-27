package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustRiskIdentify;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.riskidentify.nontoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayTrustUserRiskidentifyNontokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3168788864427252215L;

	/** 
	 * 风险识别结果
	 */
	@ApiField("ali_trust_risk_identify")
	private AliTrustRiskIdentify aliTrustRiskIdentify;

	public void setAliTrustRiskIdentify(AliTrustRiskIdentify aliTrustRiskIdentify) {
		this.aliTrustRiskIdentify = aliTrustRiskIdentify;
	}
	public AliTrustRiskIdentify getAliTrustRiskIdentify( ) {
		return this.aliTrustRiskIdentify;
	}

}
