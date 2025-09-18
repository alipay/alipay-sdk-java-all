package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收商品查询服务
 *
 * @author auto create
 * @since 1.0, 2025-08-20 11:00:58
 */
public class AlipayCommerceRecycleItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5154229796119532732L;

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
