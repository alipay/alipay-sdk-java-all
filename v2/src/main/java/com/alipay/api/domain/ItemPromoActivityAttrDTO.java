package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品对应的营销活动属性信息
 *
 * @author auto create
 * @since 1.0, 2023-09-11 10:20:04
 */
public class ItemPromoActivityAttrDTO extends AlipayObject {

	private static final long serialVersionUID = 6349551295154852687L;

	/**
	 * 属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 属性 value
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
