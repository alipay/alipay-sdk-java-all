package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ExtCategory extends AlipayObject {

	private static final long serialVersionUID = 4527325625153847327L;

	/**
	 * 品类编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 品类名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父品类编码。顶级类目此值为0
	 */
	@ApiField("parent_id")
	private String parentId;

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
