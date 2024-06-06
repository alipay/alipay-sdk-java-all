package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 13:52:00
 */
public class AnttechOceanbasePassportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4386558516474422532L;

	/** 
	 * 用户通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

}
