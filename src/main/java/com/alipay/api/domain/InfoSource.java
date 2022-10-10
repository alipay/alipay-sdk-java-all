package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 儿童信息来源，一种关联儿童信息的方式，比如可以是一个token，也可以是一个userId
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:25:49
 */
public class InfoSource extends AlipayObject {

	private static final long serialVersionUID = 1127345962184969953L;

	/**
	 * 儿童信息来源的类型，目前支持name
	 */
	@ApiField("type")
	private String type;

	/**
	 * 信息来源的取值，比如type为name时，value对应儿童的姓名
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
