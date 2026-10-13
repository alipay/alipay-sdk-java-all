package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SKU商品属性信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 10:20:20
 */
public class ItemSkuAttr extends AlipayObject {

	private static final long serialVersionUID = 2688532837915416484L;

	/**
	 * SKU商品属性key
	 */
	@ApiField("attr_code")
	private String attrCode;

	/**
	 * SKU商品属性key对应的名称
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * SKU商品属性value
	 */
	@ApiField("attr_value")
	private String attrValue;

	/**
	 * 根据商品描述信息和商品属性value生成，如每张清洗X小时，对应属性值是1，则返回的是每张清洗1小时
	 */
	@ApiField("show_text")
	private String showText;

	public String getAttrCode() {
		return this.attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
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

}
