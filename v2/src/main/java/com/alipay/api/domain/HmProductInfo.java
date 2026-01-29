package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class HmProductInfo extends AlipayObject {

	private static final long serialVersionUID = 5535855235874121631L;

	/**
	 * 商品服务单价，单位：分
	 */
	@ApiField("product_amount")
	private Long productAmount;

	/**
	 * 商品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商品服务数量
	 */
	@ApiField("product_count")
	private String productCount;

	/**
	 * 商品服务名称
	 */
	@ApiField("product_name")
	private String productName;

	public Long getProductAmount() {
		return this.productAmount;
	}
	public void setProductAmount(Long productAmount) {
		this.productAmount = productAmount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductCount() {
		return this.productCount;
	}
	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
