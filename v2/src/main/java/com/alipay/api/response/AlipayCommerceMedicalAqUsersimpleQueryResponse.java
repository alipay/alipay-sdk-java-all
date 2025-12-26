package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.aq.usersimple.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 11:52:41
 */
public class AlipayCommerceMedicalAqUsersimpleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2651547394487168558L;

	/** 
	 * 用户当前2088
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 用户当前2089
	 */
	@ApiField("aq_user_id")
	private String aqUserId;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setAqUserId(String aqUserId) {
		this.aqUserId = aqUserId;
	}
	public String getAqUserId( ) {
		return this.aqUserId;
	}

}
