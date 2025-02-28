package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.huaweimp.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-17 14:37:00
 */
public class AnttechOceanbasePassportHuaweimpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3716495166259564766L;

	/** 
	 * 加密后的账号
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * true时，accountName为空
false时，accountName为实际注册使用账号
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 通行证id，用户UID
	 */
	@ApiField("passport_id")
	private String passportId;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

}
