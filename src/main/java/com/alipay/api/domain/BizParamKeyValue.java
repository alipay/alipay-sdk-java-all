package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务参数的KeyValue键值对
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:04:12
 */
public class BizParamKeyValue extends AlipayObject {

	private static final long serialVersionUID = 4446314343996851142L;

	/**
	 * 参数名key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数值value
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
