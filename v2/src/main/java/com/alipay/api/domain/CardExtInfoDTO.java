package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充参数
 *
 * @author auto create
 * @since 1.0, 2024-07-26 11:35:14
 */
public class CardExtInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8636875395435212956L;

	/**
	 * mapkey值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 值
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
