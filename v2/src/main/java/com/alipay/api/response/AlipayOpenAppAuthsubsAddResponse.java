package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.authsubs.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:13:24
 */
public class AlipayOpenAppAuthsubsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7627311741737599871L;

	/** 
	 * 授权结果唯一标识
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 表明订购失效时间
	 */
	@ApiField("invalid_date")
	private Date invalidDate;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}
	public Date getInvalidDate( ) {
		return this.invalidDate;
	}

}
