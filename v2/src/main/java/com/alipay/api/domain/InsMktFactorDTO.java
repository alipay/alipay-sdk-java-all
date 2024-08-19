package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销规则因子
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InsMktFactorDTO extends AlipayObject {

	private static final long serialVersionUID = 4416886675597414185L;

	/**
	 * 规则因子
	 */
	@ApiField("key")
	private String key;

	/**
	 * 规则因子值
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
