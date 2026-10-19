package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询类目模版
 *
 * @author auto create
 * @since 1.0, 2026-10-10 11:37:58
 */
public class AlipayCommerceLifeserviceCategorytemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2827181798992171466L;

	/**
	 * 属性类型
	 */
	@ApiField("attr_type")
	private String attrType;

	/**
	 * 类目编码
	 */
	@ApiField("category_code")
	private String categoryCode;

	public String getAttrType() {
		return this.attrType;
	}
	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

}
