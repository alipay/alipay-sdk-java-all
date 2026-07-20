package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票产品查询
 *
 * @author auto create
 * @since 1.0, 2026-07-16 21:38:13
 */
public class AlipayCommerceEcInvoiceProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3699196192365488632L;

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
