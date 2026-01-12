package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训考试属性项
 *
 * @author auto create
 * @since 1.0, 2025-11-21 14:20:28
 */
public class ExamAttrsItemVO extends AlipayObject {

	private static final long serialVersionUID = 4849829838159137642L;

	/**
	 * 属性desc
	 */
	@ApiField("attr_desc")
	private String attrDesc;

	/**
	 * 属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性value
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrDesc() {
		return this.attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
