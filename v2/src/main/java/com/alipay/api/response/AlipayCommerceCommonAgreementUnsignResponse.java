package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.agreement.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:01:14
 */
public class AlipayCommerceCommonAgreementUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3861563186413216182L;

	/** 
	 * 已解约的支付宝签约id
	 */
	@ApiField("sign_id")
	private String signId;

	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignId( ) {
		return this.signId;
	}

}
