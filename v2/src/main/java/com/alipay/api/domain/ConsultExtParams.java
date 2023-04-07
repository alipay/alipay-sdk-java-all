package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询扩展信息，Map<String,String>类型，格式{"key":"value"}
 *
 * @author auto create
 * @since 1.0, 2019-12-20 15:15:28
 */
public class ConsultExtParams extends AlipayObject {

	private static final long serialVersionUID = 6737367712652811865L;

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
