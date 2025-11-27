package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健管履约中间页token验证
 *
 * @author auto create
 * @since 1.0, 2025-10-28 10:57:41
 */
public class AlipayCommerceMedicalHmTokencheckQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4339391438857622967L;

	/**
	 * 健管token
	 */
	@ApiField("hm_token")
	private String hmToken;

	public String getHmToken() {
		return this.hmToken;
	}
	public void setHmToken(String hmToken) {
		this.hmToken = hmToken;
	}

}
