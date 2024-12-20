package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 17:38:36
 */
public class AnttechOceanbasePassportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2715234669176719941L;

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
