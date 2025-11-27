package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:03:15
 */
public class ExtAttributeInfo extends AlipayObject {

	private static final long serialVersionUID = 8428644635211381237L;

	/**
	 * 属性code，提前和BD确定字段名称，按需填写，具体值从ntouch平台获取，跟每个子解决方案配置的code 要一致
	 */
	@ApiField("attr_code")
	private String attrCode;

	/**
	 * 属性值
	 */
	@ApiField("attr_value")
	private String attrValue;

	public String getAttrCode() {
		return this.attrCode;
	}
	public void setAttrCode(String attrCode) {
		this.attrCode = attrCode;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
