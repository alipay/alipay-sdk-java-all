package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动属性
 *
 * @author auto create
 * @since 1.0, 2023-12-10 18:15:34
 */
public class PromoActivityAttrRequest extends AlipayObject {

	private static final long serialVersionUID = 3234763652675193926L;

	/**
	 * 属性的 key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性值
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
