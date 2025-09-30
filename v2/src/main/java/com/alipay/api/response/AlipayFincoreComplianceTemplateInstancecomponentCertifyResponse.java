package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instancecomponent.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:57:26
 */
public class AlipayFincoreComplianceTemplateInstancecomponentCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4198913944893763459L;

	/** 
	 * refreshToken
	 */
	@ApiField("al_refresh_token")
	private String alRefreshToken;

	/** 
	 * refreshToken过期时间
	 */
	@ApiField("al_refresh_token_expire")
	private String alRefreshTokenExpire;

	/** 
	 * token
	 */
	@ApiField("al_token")
	private String alToken;

	/** 
	 * token有效期
	 */
	@ApiField("al_token_expire")
	private Long alTokenExpire;

	public void setAlRefreshToken(String alRefreshToken) {
		this.alRefreshToken = alRefreshToken;
	}
	public String getAlRefreshToken( ) {
		return this.alRefreshToken;
	}

	public void setAlRefreshTokenExpire(String alRefreshTokenExpire) {
		this.alRefreshTokenExpire = alRefreshTokenExpire;
	}
	public String getAlRefreshTokenExpire( ) {
		return this.alRefreshTokenExpire;
	}

	public void setAlToken(String alToken) {
		this.alToken = alToken;
	}
	public String getAlToken( ) {
		return this.alToken;
	}

	public void setAlTokenExpire(Long alTokenExpire) {
		this.alTokenExpire = alTokenExpire;
	}
	public Long getAlTokenExpire( ) {
		return this.alTokenExpire;
	}

}
