package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询类目模版
 *
 * @author auto create
 * @since 1.0, 2026-06-25 11:17:57
 */
public class AlipayCommerceLifeserviceCategorytemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8868498944412363242L;

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
