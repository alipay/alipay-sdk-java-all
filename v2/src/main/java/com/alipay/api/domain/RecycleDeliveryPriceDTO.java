package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收报价履约的价格信息
 *
 * @author auto create
 * @since 1.0, 2025-09-22 11:09:50
 */
public class RecycleDeliveryPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 1448774295784277785L;

	/**
	 * 履约价格（单位为元，金额超过1000就不允许小数点）
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
