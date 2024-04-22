package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收下单产品定量模型
 *
 * @author auto create
 * @since 1.0, 2024-04-16 17:24:27
 */
public class ProductQuantity extends AlipayObject {

	private static final long serialVersionUID = 1591517339854466959L;

	/**
	 * 产品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 产品定量数量
	 */
	@ApiField("unit_type")
	private String unitType;

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitType() {
		return this.unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
