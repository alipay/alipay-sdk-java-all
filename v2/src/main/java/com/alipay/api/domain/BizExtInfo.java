package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展信息，Map类型，格式{"key":"value"}
 *
 * @author auto create
 * @since 1.0, 2022-12-22 14:40:24
 */
public class BizExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7624343927687518894L;

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
