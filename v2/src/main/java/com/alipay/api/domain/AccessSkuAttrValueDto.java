package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku属性列表
 *
 * @author auto create
 * @since 1.0, 2023-04-26 10:19:52
 */
public class AccessSkuAttrValueDto extends AlipayObject {

	private static final long serialVersionUID = 5197436729241613197L;

	/**
	 * attr_name，用于商品同步，由调用方传入
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * attr_value_name，用于商品同步，由调用方传入
	 */
	@ApiField("attr_value_name")
	private String attrValueName;

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrValueName() {
		return this.attrValueName;
	}
	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

}
