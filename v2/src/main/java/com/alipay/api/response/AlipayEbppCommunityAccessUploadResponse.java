package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.access.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:26:40
 */
public class AlipayEbppCommunityAccessUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4459576654556518411L;

	/** 
	 * 脱敏后的手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 开门原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 脱敏后的用户名
	 */
	@ApiField("user_name")
	private String userName;

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
