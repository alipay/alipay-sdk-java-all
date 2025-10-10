package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收质检元数据
 *
 * @author auto create
 * @since 1.0, 2025-06-20 16:07:53
 */
public class RecycleQcMetadata extends AlipayObject {

	private static final long serialVersionUID = 1358392425456131811L;

	/**
	 * 属性名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
