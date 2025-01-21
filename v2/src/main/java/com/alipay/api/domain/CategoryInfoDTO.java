package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 类目信息列表
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:10:42
 */
public class CategoryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8233152465647557392L;

	/**
	 * 服务商可使用的场景类目
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
