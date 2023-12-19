package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.huaweimp.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-08 15:11:48
 */
public class AnttechOceanbasePassportHuaweimpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448333235166293626L;

	/** 
	 * 通行证id，用户UID
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
