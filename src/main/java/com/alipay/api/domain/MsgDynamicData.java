package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息动态数据
 *
 * @author auto create
 * @since 1.0, 2022-04-19 11:19:36
 */
public class MsgDynamicData extends AlipayObject {

	private static final long serialVersionUID = 1536363954822156483L;

	/**
	 * 品牌名称
	 */
	@ApiField("dynamic_type")
	private String dynamicType;

	/**
	 * 动态内容值
	 */
	@ApiField("dynamic_value")
	private String dynamicValue;

	public String getDynamicType() {
		return this.dynamicType;
	}
	public void setDynamicType(String dynamicType) {
		this.dynamicType = dynamicType;
	}

	public String getDynamicValue() {
		return this.dynamicValue;
	}
	public void setDynamicValue(String dynamicValue) {
		this.dynamicValue = dynamicValue;
	}

}
