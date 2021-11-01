package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务schema
 *
 * @author auto create
 * @since 1.0, 2021-08-23 14:59:31
 */
public class AlipayOpenAppServiceSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7229436328296975834L;

	/**
	 * 类目id
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
