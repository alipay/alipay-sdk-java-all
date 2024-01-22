package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.
 *
 * @author auto create
 * @since 1.0, 2023-11-02 20:18:46
 */
public class AlipayOpenDdDstestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8781595937838114855L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
