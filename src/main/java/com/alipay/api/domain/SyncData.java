package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步数据模型
 *
 * @author auto create
 * @since 1.0, 2022-06-23 20:34:18
 */
public class SyncData extends AlipayObject {

	private static final long serialVersionUID = 8211422896946541637L;

	/**
	 * 字段field
	 */
	@ApiField("field")
	private String field;

	/**
	 * 字段值，默认转成字符串类型
	 */
	@ApiField("value")
	private String value;

	public String getField() {
		return this.field;
	}
	public void setField(String field) {
		this.field = field;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
