package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 团购店铺类目分类信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:42:30
 */
public class GroupPurchaseCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 8782393122686674845L;

	/**
	 * 类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

}
