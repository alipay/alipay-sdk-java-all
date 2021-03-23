package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务schema
 *
 * @author auto create
 * @since 1.0, 2021-03-18 14:40:46
 */
public class AlipayOpenAppServiceSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8839397468447792657L;

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
