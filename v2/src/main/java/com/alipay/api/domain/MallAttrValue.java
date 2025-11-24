package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 采购商城属性关联对象
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:23:03
 */
public class MallAttrValue extends AlipayObject {

	private static final long serialVersionUID = 2672122417399177865L;

	/**
	 * 属性Id，非必传
	 */
	@ApiField("attr_id")
	private String attrId;

	/**
	 * 属性名称描述，用户录入
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 属性值，用户录入，如 TXMZFM00762542，对应的Id
	 */
	@ApiField("attr_value_id")
	private String attrValueId;

	/**
	 * 属性值名称，用户录入
	 */
	@ApiField("attr_value_name")
	private String attrValueName;

	public String getAttrId() {
		return this.attrId;
	}
	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValueId() {
		return this.attrValueId;
	}
	public void setAttrValueId(String attrValueId) {
		this.attrValueId = attrValueId;
	}

	public String getAttrValueName() {
		return this.attrValueName;
	}
	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

}
