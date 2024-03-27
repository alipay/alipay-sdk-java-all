package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.huaweimp.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:25:26
 */
public class AnttechOceanbasePassportHuaweimpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3491735346625377461L;

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
