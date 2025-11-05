package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业根据授权码获取用户信息
 *
 * @author auto create
 * @since 1.0, 2025-09-28 11:35:06
 */
public class AlipayCommerceMedicalMemberAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4289486121136332281L;

	/**
	 * 医疗会员token
	 */
	@ApiField("access_token")
	private String accessToken;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
