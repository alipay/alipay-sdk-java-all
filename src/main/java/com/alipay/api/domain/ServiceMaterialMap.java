package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务素材内容
 *
 * @author auto create
 * @since 1.0, 2019-11-14 17:34:42
 */
public class ServiceMaterialMap extends AlipayObject {

	private static final long serialVersionUID = 1199189374312783577L;

	/**
	 * 素材的key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 素材值
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
