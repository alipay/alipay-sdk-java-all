package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业经营记录元素
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:01:39
 */
public class OperationalReport extends AlipayObject {

	private static final long serialVersionUID = 7829989143392352596L;

	/**
	 * 企业经营记录元素key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 企业经营记录value
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
