package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.archive.empower.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 16:17:49
 */
public class AlipayCommerceMedicalArchiveEmpowerSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8696776253685223492L;

	/** 
	 * 认证令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 档案成员h5页面url
	 */
	@ApiField("archives_member_url")
	private String archivesMemberUrl;

	/** 
	 * 成员是否有效
	 */
	@ApiField("member_validate")
	private String memberValidate;

	/** 
	 * access_token有效期
	 */
	@ApiField("token_validity")
	private String tokenValidity;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setArchivesMemberUrl(String archivesMemberUrl) {
		this.archivesMemberUrl = archivesMemberUrl;
	}
	public String getArchivesMemberUrl( ) {
		return this.archivesMemberUrl;
	}

	public void setMemberValidate(String memberValidate) {
		this.memberValidate = memberValidate;
	}
	public String getMemberValidate( ) {
		return this.memberValidate;
	}

	public void setTokenValidity(String tokenValidity) {
		this.tokenValidity = tokenValidity;
	}
	public String getTokenValidity( ) {
		return this.tokenValidity;
	}

}
