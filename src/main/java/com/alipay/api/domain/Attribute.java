package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容的扩展属性信息，适用于POI、商品、功能等多种类型的应用内容。属性的具体结构，统一在服务平台appxmng/appxcore由内部小二通过元数据进行管理约束。
 *
 * @author auto create
 * @since 1.0, 2020-06-23 16:26:04
 */
public class Attribute extends AlipayObject {

	private static final long serialVersionUID = 8334462634197147419L;

	/**
	 * 扩展属性的key，由支付宝侧定义分配
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性的值，如果“单一值”，数组只有一项；如果是“多值”，则数组对应有多项。
	 */
	@ApiListField("value")
	@ApiField("string")
	private List<String> value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<String> getValue() {
		return this.value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}
