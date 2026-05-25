package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务商品自定义属性项
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:15:56
 */
public class LsItemCustomAttrItem extends AlipayObject {

	private static final long serialVersionUID = 3138227482297212443L;

	/**
	 * 自定义属性的属性名
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 自定义属性值
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
