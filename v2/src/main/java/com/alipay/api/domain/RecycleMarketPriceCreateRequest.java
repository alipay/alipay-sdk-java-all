package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class RecycleMarketPriceCreateRequest extends AlipayObject {

	private static final long serialVersionUID = 7221227435572622416L;

	/**
	 * 用来描述回收商品的成色
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 行情价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
