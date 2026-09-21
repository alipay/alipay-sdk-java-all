package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 归还地址废弃
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:50
 */
public class AlipayCommerceRentDistmerchantAddressDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1749299289612392475L;

	/**
	 * 地址ID
	 */
	@ApiField("address_id")
	private String addressId;

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
