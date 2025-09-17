package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台已发布发票产品
 *
 * @author auto create
 * @since 1.0, 2025-04-07 13:41:51
 */
public class InvoiceProductInfo extends AlipayObject {

	private static final long serialVersionUID = 8655438256326733388L;

	/**
	 * 发票产品描述
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 发票产品编号
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 发票产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 发票产品类型
	 */
	@ApiField("product_type")
	private String productType;

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}
