package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 欠费单具体明细说明
 *
 * @author auto create
 * @since 1.0, 2013-08-12 15:05:22
 */
public class QueryInstBillDetail extends AlipayObject {

	private static final long serialVersionUID = 3818775188716976987L;

	/**
	 * 明细key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 明细描述
	 */
	@ApiField("name")
	private String name;

	/**
	 * 明细对应值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
