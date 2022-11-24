package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.invite.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-18 23:21:37
 */
public class AlipayCommerceEcEmployeeInviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7472399493239735589L;

	/** 
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
