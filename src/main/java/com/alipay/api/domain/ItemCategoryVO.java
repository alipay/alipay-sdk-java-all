package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品类目
 *
 * @author auto create
 * @since 1.0, 2020-08-11 10:06:05
 */
public class ItemCategoryVO extends AlipayObject {

	private static final long serialVersionUID = 1457189776754632144L;

	/**
	 * 商品类目ID及信息可通过 商品类目表 获取
	 */
	@ApiField("category_id")
	private String categoryId;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

}
