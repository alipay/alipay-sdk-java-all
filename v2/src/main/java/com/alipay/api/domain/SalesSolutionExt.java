package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进方案扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-03-17 16:40:21
 */
public class SalesSolutionExt extends AlipayObject {

	private static final long serialVersionUID = 7428262594453547567L;

	/**
	 * 必须是数字格式，单位元，在使用全额付动态价格方案做卖进时，根据该字段传入该次卖进的价格。
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
