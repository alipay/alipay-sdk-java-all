package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专辑拓展信息，内部为key、value字段，类似Map
 *
 * @author auto create
 * @since 1.0, 2023-03-02 20:09:16
 */
public class AlbumExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7354541287778468158L;

	/**
	 * 该字段为拓展信息中的key值，例如需传入 key=value，该字段放入key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 该字段为拓展信息中的value值，例如有 key=value，该字段放入value
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
