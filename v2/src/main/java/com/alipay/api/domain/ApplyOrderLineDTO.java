package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单明细行
 *
 * @author auto create
 * @since 1.0, 2023-03-03 17:12:22
 */
public class ApplyOrderLineDTO extends AlipayObject {

	private static final long serialVersionUID = 1821514694165877926L;

	/**
	 * 后台产品码
	 */
	@ApiField("fulfil_product_code")
	private String fulfilProductCode;

	/**
	 * 简单合约属性
	 */
	@ApiField("product_property")
	private String productProperty;

	/**
	 * 前台产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	public String getFulfilProductCode() {
		return this.fulfilProductCode;
	}
	public void setFulfilProductCode(String fulfilProductCode) {
		this.fulfilProductCode = fulfilProductCode;
	}

	public String getProductProperty() {
		return this.productProperty;
	}
	public void setProductProperty(String productProperty) {
		this.productProperty = productProperty;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

}
