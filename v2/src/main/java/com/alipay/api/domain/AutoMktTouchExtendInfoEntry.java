package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险用户触达扩展信息K-V基本元素
 *
 * @author auto create
 * @since 1.0, 2019-03-12 14:36:56
 */
public class AutoMktTouchExtendInfoEntry extends AlipayObject {

	private static final long serialVersionUID = 5395774277367257467L;

	/**
	 * 扩展信息元素的Key值。
	 */
	@ApiField("key")
	private String key;

	/**
	 * 扩展字段的值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
