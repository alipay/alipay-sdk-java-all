package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通接口——资质
 *
 * @author auto create
 * @since 1.0, 2024-08-20 19:54:28
 */
public class SettleInMerchantLicense extends AlipayObject {

	private static final long serialVersionUID = 3373671614587279446L;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
