package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品信息
 *
 * @author auto create
 * @since 1.0, 2021-04-06 16:45:00
 */
public class ProductGroup extends AlipayObject {

	private static final long serialVersionUID = 1779736411323742639L;

	/**
	 * 数目
	 */
	@ApiField("count")
	private String count;

	/**
	 * 产品对象
	 */
	@ApiField("product")
	private ProductInfo product;

	/**
	 * 产品总价(单位：元)
	 */
	@ApiField("total_price")
	private String totalPrice;

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public ProductInfo getProduct() {
		return this.product;
	}
	public void setProduct(ProductInfo product) {
		this.product = product;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
