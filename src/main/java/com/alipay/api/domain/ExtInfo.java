package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2018-03-29 17:53:24
 */
public class ExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7647248761389622585L;

	/**
	 * 键
	 */
	@ApiField("key_1")
	private String key1;

	/**
	 * 键2
	 */
	@ApiField("key_2")
	private String key2;

	public String getKey1() {
		return this.key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return this.key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}

}
