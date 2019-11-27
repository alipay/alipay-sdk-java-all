package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目删除接口
 *
 * @author auto create
 * @since 1.0, 2017-08-30 10:54:54
 */
public class KoubeiItemExtitemCategoryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6591921674682884667L;

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
