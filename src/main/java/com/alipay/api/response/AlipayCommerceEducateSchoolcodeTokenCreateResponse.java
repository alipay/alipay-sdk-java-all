package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolcode.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:04
 */
public class AlipayCommerceEducateSchoolcodeTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6636961277971992865L;

	/** 
	 * 学生信息凭证，在用户信息授权时使用，作为授权url中state的参数值，创建token接口返回
	 */
	@ApiField("school_code_token")
	private String schoolCodeToken;

	public void setSchoolCodeToken(String schoolCodeToken) {
		this.schoolCodeToken = schoolCodeToken;
	}
	public String getSchoolCodeToken( ) {
		return this.schoolCodeToken;
	}

}
