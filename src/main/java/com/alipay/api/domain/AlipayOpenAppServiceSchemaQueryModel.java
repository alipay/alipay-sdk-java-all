package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务schema
 *
 * @author auto create
 * @since 1.0, 2022-04-28 13:56:50
 */
public class AlipayOpenAppServiceSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6685435953553234469L;

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
