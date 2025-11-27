package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展信息，Map类型，格式{"key":"value"}
 *
 * @author auto create
 * @since 1.0, 2023-08-29 10:57:01
 */
public class BizExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1311382154734771637L;

	/**
	 * key-value
	 */
	@ApiField("key")
	private String key;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
