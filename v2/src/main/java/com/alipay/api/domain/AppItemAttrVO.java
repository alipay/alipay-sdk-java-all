package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2023-03-29 21:02:53
 */
public class AppItemAttrVO extends AlipayObject {

	private static final long serialVersionUID = 1544788362417413588L;

	/**
	 * 商品属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 商品属性value
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
