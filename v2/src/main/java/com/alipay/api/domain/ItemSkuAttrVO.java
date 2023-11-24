package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku销售属性
 *
 * @author auto create
 * @since 1.0, 2023-06-27 23:08:25
 */
public class ItemSkuAttrVO extends AlipayObject {

	private static final long serialVersionUID = 8252595361912543753L;

	/**
	 * 销售属性key值
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 销售属性值
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
