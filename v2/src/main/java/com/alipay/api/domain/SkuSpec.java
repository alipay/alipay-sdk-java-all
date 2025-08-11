package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku规格
 *
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:38
 */
public class SkuSpec extends AlipayObject {

	private static final long serialVersionUID = 8216537597744581122L;

	/**
	 * 规格名
	 */
	@ApiField("key")
	private String key;

	/**
	 * 规格值
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
