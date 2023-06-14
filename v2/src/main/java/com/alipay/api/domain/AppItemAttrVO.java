package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, 2023-05-28 23:21:20
 */
public class AppItemAttrVO extends AlipayObject {

	private static final long serialVersionUID = 5293546536154326274L;

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
