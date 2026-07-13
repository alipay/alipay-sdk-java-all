package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心生活商品属性
 *
 * @author auto create
 * @since 1.0, 2026-07-10 13:44:57
 */
public class AxfItemAttr extends AlipayObject {

	private static final long serialVersionUID = 6397592291718837697L;

	/**
	 * 商品属性key
	 */
	@ApiField("attr_key")
	private String attrKey;

	/**
	 * 商品属性key对应的名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * 商品属性value
	 */
	@ApiField("attr_value")
	private String attrValue;

	/**
	 * 根据商品描述信息和商品属性value生成，如每张清洗X小时，对应属性值是1，则返回的是每张清洗1小时
	 */
	@ApiField("show_text")
	private String showText;

	/**
	 * 用于说明属性单位。结合attr_value使用，如1月，1天，1年
	 */
	@ApiField("unit")
	private String unit;

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

	public String getShowText() {
		return this.showText;
	}
	public void setShowText(String showText) {
		this.showText = showText;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
