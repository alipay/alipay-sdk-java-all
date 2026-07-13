package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:52:45
 */
public class CeAppItemAttrVO extends AlipayObject {

	private static final long serialVersionUID = 4192884364121681963L;

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
