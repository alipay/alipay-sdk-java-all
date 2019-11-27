package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品的SKU结果
 *
 * @author auto create
 * @since 1.0, 2016-04-12 11:36:23
 */
public class IsvDishSku extends AlipayObject {

	private static final long serialVersionUID = 1885542573523972899L;

	/**
	 * 属性名称
	 */
	@ApiField("p_name")
	private String pName;

	/**
	 * 属性值
	 */
	@ApiField("p_value")
	private String pValue;

	/**
	 * 菜品价格   单个SKU价格 单位是分
	 */
	@ApiField("price")
	private String price;

	/**
	 * 菜品库存
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getpName() {
		return this.pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpValue() {
		return this.pValue;
	}
	public void setpValue(String pValue) {
		this.pValue = pValue;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
