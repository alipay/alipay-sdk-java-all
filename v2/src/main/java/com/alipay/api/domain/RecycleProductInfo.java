package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收产品模型
 *
 * @author auto create
 * @since 1.0, 2023-08-22 17:48:09
 */
public class RecycleProductInfo extends AlipayObject {

	private static final long serialVersionUID = 3251612594159983658L;

	/**
	 * 品牌code
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品类code
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
