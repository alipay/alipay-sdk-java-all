package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SPU属性列表
 *
 * @author auto create
 * @since 1.0, 2025-03-31 11:41:53
 */
public class SpuAttributeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3781416879591457515L;

	/**
	 * 属性KEY
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * SPU属性名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	/**
	 * 属性值id
	 */
	@ApiField("attr_value_id")
	private String attrValueId;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

	public String getAttrValueId() {
		return this.attrValueId;
	}
	public void setAttrValueId(String attrValueId) {
		this.attrValueId = attrValueId;
	}

}
