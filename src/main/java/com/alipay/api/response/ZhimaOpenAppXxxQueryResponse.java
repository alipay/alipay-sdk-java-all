package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.xxx.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-09 09:28:46
 */
public class ZhimaOpenAppXxxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8522119395512282137L;

	/** 
	 * 座机号码
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
