package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * key-value模型对象
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:51:53
 */
public class MExtInfo extends AlipayObject {

	private static final long serialVersionUID = 5147991128282764112L;

	/**
	 * 扩展信息key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 扩展信息value值
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
