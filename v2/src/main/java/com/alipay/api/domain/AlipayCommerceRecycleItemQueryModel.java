package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收商品查询服务
 *
 * @author auto create
 * @since 1.0, 2025-02-12 10:17:22
 */
public class AlipayCommerceRecycleItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4619379392613666315L;

	/**
	 * 产品code，用来描述商品的SPU_ID
	 */
	@ApiField("product_code")
	private String productCode;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
