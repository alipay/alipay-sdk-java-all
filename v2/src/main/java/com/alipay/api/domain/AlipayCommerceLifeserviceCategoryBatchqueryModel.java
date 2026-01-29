package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目树查询
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AlipayCommerceLifeserviceCategoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5521585695383431974L;

	/**
	 * 类目编码
	 */
	@ApiField("parent_category_code")
	private String parentCategoryCode;

	public String getParentCategoryCode() {
		return this.parentCategoryCode;
	}
	public void setParentCategoryCode(String parentCategoryCode) {
		this.parentCategoryCode = parentCategoryCode;
	}

}
