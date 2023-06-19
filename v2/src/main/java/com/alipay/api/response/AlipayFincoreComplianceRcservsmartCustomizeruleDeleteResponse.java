package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RcSmartCustomizeRuleResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.rcservsmart.customizerule.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:46:56
 */
public class AlipayFincoreComplianceRcservsmartCustomizeruleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2481783436123895725L;

	/** 
	 * 自定义规则返回体
	 */
	@ApiField("rcsmart_common_response")
	private RcSmartCustomizeRuleResponse rcsmartCommonResponse;

	public void setRcsmartCommonResponse(RcSmartCustomizeRuleResponse rcsmartCommonResponse) {
		this.rcsmartCommonResponse = rcsmartCommonResponse;
	}
	public RcSmartCustomizeRuleResponse getRcsmartCommonResponse( ) {
		return this.rcsmartCommonResponse;
	}

}
