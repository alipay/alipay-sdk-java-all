package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收商品查询服务
 *
 * @author auto create
 * @since 1.0, 2025-04-13 19:42:26
 */
public class AlipayCommerceRecycleItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1844915526965827744L;

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
