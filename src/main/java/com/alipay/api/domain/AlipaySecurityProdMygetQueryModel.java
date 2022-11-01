package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * myget
 *
 * @author auto create
 * @since 1.0, 2021-09-02 01:57:09
 */
public class AlipaySecurityProdMygetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1218541268677681676L;

	/**
	 * 描述
	 */
	@ApiField("extend_params")
	private ExtendParams extendParams;

	/**
	 * 座机号码
	 */
	@ApiField("phone")
	private String phone;

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
