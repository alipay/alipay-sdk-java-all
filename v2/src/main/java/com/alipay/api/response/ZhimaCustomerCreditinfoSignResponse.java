package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.creditinfo.sign response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 20:57:36
 */
public class ZhimaCustomerCreditinfoSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7255786423953369875L;

	/** 
	 * 授权成功：SUCCESS；授权失败：FAIL
	 */
	@ApiField("auth_result")
	private String authResult;

	/** 
	 * 当auth_result的值为FAIL时，can_auth才会有值，true代表可以授权，false代表不可以授权
	 */
	@ApiField("can_auth")
	private Boolean canAuth;

	/** 
	 * 用户授权成功后，芝麻侧生成的唯一授权单号
	 */
	@ApiField("sign_id")
	private String signId;

	public void setAuthResult(String authResult) {
		this.authResult = authResult;
	}
	public String getAuthResult( ) {
		return this.authResult;
	}

	public void setCanAuth(Boolean canAuth) {
		this.canAuth = canAuth;
	}
	public Boolean getCanAuth( ) {
		return this.canAuth;
	}

	public void setSignId(String signId) {
		this.signId = signId;
	}
	public String getSignId( ) {
		return this.signId;
	}

}
