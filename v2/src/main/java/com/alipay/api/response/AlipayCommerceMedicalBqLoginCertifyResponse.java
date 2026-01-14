package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BianQueUserAuthDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.bq.login.certify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 16:02:47
 */
public class AlipayCommerceMedicalBqLoginCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7336873781291149553L;

	/** 
	 * 用于返回用户信息（姓名、证件号码、证件类型、手机号）
	 */
	@ApiField("user_auth_detail")
	private BianQueUserAuthDetail userAuthDetail;

	public void setUserAuthDetail(BianQueUserAuthDetail userAuthDetail) {
		this.userAuthDetail = userAuthDetail;
	}
	public BianQueUserAuthDetail getUserAuthDetail( ) {
		return this.userAuthDetail;
	}

}
