package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.scenepay.authorize.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 14:35:14
 */
public class AlipayFundScenepayAuthorizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351744976263187892L;

	/** 
	 * 授权ID
	 */
	@ApiField("authorization_id")
	private String authorizationId;

	/** 
	 * 已签约则展示签约管理链接
	 */
	@ApiField("authorize_manage_url")
	private String authorizeManageUrl;

	/** 
	 * 签约平台
	 */
	@ApiField("authorize_platform")
	private String authorizePlatform;

	/** 
	 * 外部签约号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/** 
	 * NORMAL 正常状态
UNSIGN 未签约或已解约
	 */
	@ApiField("status")
	private String status;

	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}
	public String getAuthorizationId( ) {
		return this.authorizationId;
	}

	public void setAuthorizeManageUrl(String authorizeManageUrl) {
		this.authorizeManageUrl = authorizeManageUrl;
	}
	public String getAuthorizeManageUrl( ) {
		return this.authorizeManageUrl;
	}

	public void setAuthorizePlatform(String authorizePlatform) {
		this.authorizePlatform = authorizePlatform;
	}
	public String getAuthorizePlatform( ) {
		return this.authorizePlatform;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
