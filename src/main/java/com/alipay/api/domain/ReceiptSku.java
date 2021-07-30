package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票商品详情
 *
 * @author auto create
 * @since 1.0, 2021-03-31 11:19:08
 */
public class ReceiptSku extends AlipayObject {

	private static final long serialVersionUID = 8375499322849783294L;

	/**
	 * 商品条形码
	 */
	@ApiField("barcode")
	private String barcode;

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
	 * 商品价格，单位分
	 */
	@ApiField("price")
	private Long price;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

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

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
