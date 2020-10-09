package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展信息，Map类型，格式{"key":"value"}
 *
 * @author auto create
 * @since 1.0, 2020-09-11 18:05:11
 */
public class BizExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2759556698153293159L;

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
