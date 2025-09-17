package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 传入扩展信息，比如传入二维实体ID
 *
 * @author auto create
 * @since 1.0, 2025-09-11 11:02:38
 */
public class LabelUpdateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7351949615462665929L;

	/**
	 * 对齐JSON/Map结构，传入key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 对齐JSON/Map结构，传入value
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
