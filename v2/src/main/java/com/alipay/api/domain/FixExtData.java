package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态协同平台的扩展信息的键值对
 *
 * @author auto create
 * @since 1.0, 2020-03-27 15:57:06
 */
public class FixExtData extends AlipayObject {

	private static final long serialVersionUID = 3257264891996143228L;

	/**
	 * 生态协同平台中，扩展信息的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 生态协同平台中，扩展信息的值
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
