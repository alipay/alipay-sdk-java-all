package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务属性
 *
 * @author auto create
 * @since 1.0, 2026-01-26 15:35:32
 */
public class LifeServiceAttr extends AlipayObject {

	private static final long serialVersionUID = 2513189272471985478L;

	/**
	 * 生活服务属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 生活服务属性value
	 */
	@ApiField("attr_value")
	private String attrValue;

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
