package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.
 *
 * @author auto create
 * @since 1.0, 2024-01-29 16:07:15
 */
public class AlipayOpenDdDstestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2562229436352495635L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 详细地址
	 */
	@ApiField("address_open_id")
	private String addressOpenId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressOpenId() {
		return this.addressOpenId;
	}
	public void setAddressOpenId(String addressOpenId) {
		this.addressOpenId = addressOpenId;
	}

}
