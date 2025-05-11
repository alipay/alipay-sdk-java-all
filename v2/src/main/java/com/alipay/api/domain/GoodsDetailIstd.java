package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品明细
 *
 * @author auto create
 * @since 1.0, 2023-02-17 11:47:50
 */
public class GoodsDetailIstd extends AlipayObject {

	private static final long serialVersionUID = 4667545221928288664L;

	/**
	 * 商品数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商品单价
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品单位
	 */
	@ApiField("unit")
	private String unit;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
