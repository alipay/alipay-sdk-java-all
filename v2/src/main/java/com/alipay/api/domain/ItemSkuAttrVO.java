package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku销售属性
 *
 * @author auto create
 * @since 1.0, 2024-09-10 17:17:18
 */
public class ItemSkuAttrVO extends AlipayObject {

	private static final long serialVersionUID = 6589744868418459458L;

	/**
	 * 销售属性key值
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性的类型，选填，不填时默认赋值spec
	 */
	@ApiField("attr_type")
	private String attrType;

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

	public String getAttrType() {
		return this.attrType;
	}
	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
