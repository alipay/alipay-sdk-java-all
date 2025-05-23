package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * saas化支付场景，商品信息
 *
 * @author auto create
 * @since 1.0, 2023-06-21 13:57:34
 */
public class PaymentGoods extends AlipayObject {

	private static final long serialVersionUID = 2353216731927358646L;

	/**
	 * 商品品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商品类目编码
	 */
	@ApiField("category")
	private String category;

	/**
	 * 数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 商品单价。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("unit_amount")
	private String unitAmount;

	/**
	 * 商品单价币种
	 */
	@ApiField("unit_currency")
	private String unitCurrency;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}

	public String getUnitCurrency() {
		return this.unitCurrency;
	}
	public void setUnitCurrency(String unitCurrency) {
		this.unitCurrency = unitCurrency;
	}

}
