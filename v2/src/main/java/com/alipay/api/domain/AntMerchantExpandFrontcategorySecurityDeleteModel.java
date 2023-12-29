package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 前台类目删除
 *
 * @author auto create
 * @since 1.0, 2023-07-05 10:58:26
 */
public class AntMerchantExpandFrontcategorySecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3534129222268918589L;

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
