package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * acme密钥配置
 *
 * @author auto create
 * @since 1.0, 2024-06-06 16:20:01
 */
public class AcmeKeyConfig extends AlipayObject {

	private static final long serialVersionUID = 3129619931679143516L;

	/**
	 * key详情
	 */
	@ApiField("key_description")
	private String keyDescription;

	/**
	 * key名称
	 */
	@ApiField("key_name")
	private String keyName;

	/**
	 * key的值
	 */
	@ApiField("key_value")
	private String keyValue;

	public String getKeyDescription() {
		return this.keyDescription;
	}
	public void setKeyDescription(String keyDescription) {
		this.keyDescription = keyDescription;
	}

	public String getKeyName() {
		return this.keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyValue() {
		return this.keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

}
