package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.token.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:54:38
 */
public class AlipayEcoEprintTokenRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 4156843873749736967L;

	/** 
	 * 访问易联云凭证
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 预计过期时间秒
	 */
	@ApiField("expected_expires_in")
	private String expectedExpiresIn;

	/** 
	 * 过期时长秒
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 4004578279
	 */
	@ApiField("machine_code")
	private String machineCode;

	/** 
	 * 更新AccessToken凭证
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setExpectedExpiresIn(String expectedExpiresIn) {
		this.expectedExpiresIn = expectedExpiresIn;
	}
	public String getExpectedExpiresIn( ) {
		return this.expectedExpiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	public String getMachineCode( ) {
		return this.machineCode;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

}
