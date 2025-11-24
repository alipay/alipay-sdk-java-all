package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收问卷查询
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:33
 */
public class AlipayCommerceRecycleQuestionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6471368559256917118L;

	/**
	 * 产品code
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
