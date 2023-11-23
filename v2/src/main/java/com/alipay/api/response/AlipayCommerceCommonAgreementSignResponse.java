package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-20 13:46:50
 */
public class AlipayCommerceCommonAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211352277545975343L;

	/** 
	 * 支付宝签约id，全局唯一
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
