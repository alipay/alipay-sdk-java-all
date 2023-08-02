package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售属性
 *
 * @author auto create
 * @since 1.0, 2023-03-23 19:15:54
 */
public class AppItemAttr extends AlipayObject {

	private static final long serialVersionUID = 1582568137131994261L;

	/**
	 * 销售属性key（自定义）
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 销售属性value（自定义），字符类型，最长不超过40，相同 key 下不能超过100个不同value。
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
