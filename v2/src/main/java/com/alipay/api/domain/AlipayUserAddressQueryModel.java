package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据addressId获取用户详细地址信息
 *
 * @author auto create
 * @since 1.0, 2023-02-24 16:21:39
 */
public class AlipayUserAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2797234249137237812L;

	/**
	 * 用户地址唯一ID。通过调用小程序开放api(my.chooseAddress)获取。
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
