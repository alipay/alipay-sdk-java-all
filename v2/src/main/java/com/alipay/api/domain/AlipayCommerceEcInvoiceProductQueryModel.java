package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票产品查询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:58:04
 */
public class AlipayCommerceEcInvoiceProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4478127479638922617L;

	/**
	 * 发票产品类型
	 */
	@ApiField("product_type")
	private String productType;

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}
