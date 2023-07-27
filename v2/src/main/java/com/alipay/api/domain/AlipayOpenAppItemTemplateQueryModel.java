package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商品类目信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 17:01:35
 */
public class AlipayOpenAppItemTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6433591328733838872L;

	/**
	 * 平台类目，填写的类目必须在类目表列出，只填最后一级。商品类目 ID 及信息可通过商品类目表获取。
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
