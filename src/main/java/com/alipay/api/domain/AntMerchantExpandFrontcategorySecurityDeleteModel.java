package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前台类目删除
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:33:27
 */
public class AntMerchantExpandFrontcategorySecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5793174351417663994L;

	/**
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

}
