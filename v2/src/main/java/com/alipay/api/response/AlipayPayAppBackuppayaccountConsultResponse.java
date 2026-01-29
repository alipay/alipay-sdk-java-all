package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.backuppayaccount.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 11:07:42
 */
public class AlipayPayAppBackuppayaccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874413769949322743L;

	/** 
	 * 备用账号脱敏登录号
	 */
	@ApiField("hidden_login_id")
	private String hiddenLoginId;

	/** 
	 * 是否开通备用付款账号
	 */
	@ApiField("open_same_person")
	private Boolean openSamePerson;

	public void setHiddenLoginId(String hiddenLoginId) {
		this.hiddenLoginId = hiddenLoginId;
	}
	public String getHiddenLoginId( ) {
		return this.hiddenLoginId;
	}

	public void setOpenSamePerson(Boolean openSamePerson) {
		this.openSamePerson = openSamePerson;
	}
	public Boolean getOpenSamePerson( ) {
		return this.openSamePerson;
	}

}
