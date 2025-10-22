package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序二级类目信息
 *
 * @author auto create
 * @since 1.0, 2018-12-17 17:26:37
 */
public class MiniAppSecondCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 2595784463864324291L;

	/**
	 * 小程序类目Id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 度假用别墅服务
	 */
	@ApiField("category_name")
	private String categoryName;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
