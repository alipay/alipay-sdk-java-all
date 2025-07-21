package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:33:14
 */
public class AmpeCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 4232745474125527467L;

	/**
	 * 行业描述
	 */
	@ApiField("category_desc")
	private String categoryDesc;

	/**
	 * 行业id
	 */
	@ApiField("category_id")
	private String categoryId;

	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

}
