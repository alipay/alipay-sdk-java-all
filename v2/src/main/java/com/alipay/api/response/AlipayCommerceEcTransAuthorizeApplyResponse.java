package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.authorize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-25 17:41:45
 */
public class AlipayCommerceEcTransAuthorizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4226347767294879726L;

	/** 
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 转账授权页面URL
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
