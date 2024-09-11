package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付开通接口——资质
 *
 * @author auto create
 * @since 1.0, 2024-09-02 16:33:51
 */
public class SettleInMerchantLicense extends AlipayObject {

	private static final long serialVersionUID = 1592277855862227557L;

	/**
	 * 商户简称。用于芝麻信用服务开通。
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
