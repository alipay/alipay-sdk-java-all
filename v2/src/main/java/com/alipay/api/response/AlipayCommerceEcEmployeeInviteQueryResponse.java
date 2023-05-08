package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.invite.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 02:36:53
 */
public class AlipayCommerceEcEmployeeInviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6291537618591695699L;

	/** 
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/** 
	 * 支付宝服务商小程序跳入企业码小程序签约链接
	 */
	@ApiField("mini_app_sign_url")
	private String miniAppSignUrl;

	/** 
	 * 邀请链接
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public String getEnterpriseId( ) {
		return this.enterpriseId;
	}

	public void setMiniAppSignUrl(String miniAppSignUrl) {
		this.miniAppSignUrl = miniAppSignUrl;
	}
	public String getMiniAppSignUrl( ) {
		return this.miniAppSignUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
