package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:10:39
 */
public class AttrExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1673491329822456948L;

	/**
	 * 属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 行业属性值
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
