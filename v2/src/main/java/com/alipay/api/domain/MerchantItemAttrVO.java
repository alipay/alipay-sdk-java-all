package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家商品属性信息
 *
 * @author auto create
 * @since 1.0, 2024-01-03 14:50:03
 */
public class MerchantItemAttrVO extends AlipayObject {

	private static final long serialVersionUID = 5889622759482969793L;

	/**
	 * 商家侧商品属性key，如available_city_codes可售城市编码等
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 商家侧商品属性值，与attr_key相对应。
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
