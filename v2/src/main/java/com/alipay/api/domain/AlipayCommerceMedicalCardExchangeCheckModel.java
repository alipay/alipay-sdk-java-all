package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券码兑换预校验
 *
 * @author auto create
 * @since 1.0, 2025-07-09 19:30:22
 */
public class AlipayCommerceMedicalCardExchangeCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7543859573652167399L;

	/**
	 * 用户手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
