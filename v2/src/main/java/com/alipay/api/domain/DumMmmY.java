package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * DumMmmY
 *
 * @author auto create
 * @since 1.0, 2023-09-06 15:42:53
 */
public class DumMmmY extends AlipayObject {

	private static final long serialVersionUID = 6611938398656172593L;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
