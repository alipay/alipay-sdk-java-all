package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗门店店员用户ID查询
 *
 * @author auto create
 * @since 1.0, 2025-07-23 11:03:47
 */
public class AlipayCommerceMedicalCommercialUserAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5718196438573689643L;

	/**
	 * 授权码，用户对应用授权后得到。
	 */
	@ApiField("auth_code")
	private String authCode;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

}
