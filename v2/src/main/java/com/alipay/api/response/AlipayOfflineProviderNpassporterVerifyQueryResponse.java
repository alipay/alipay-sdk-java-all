package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-01 15:07:41
 */
public class AlipayOfflineProviderNpassporterVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5416922332412434933L;

	/** 
	 * 用户手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/** 
	 * 是否核身成功
	 */
	@ApiField("verified")
	private Boolean verified;

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber( ) {
		return this.phoneNumber;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public Boolean getVerified( ) {
		return this.verified;
	}

}
