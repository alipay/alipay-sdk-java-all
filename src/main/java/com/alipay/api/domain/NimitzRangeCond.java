package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz 专用范围条件模型
 *
 * @author auto create
 * @since 1.0, 2022-06-13 11:05:33
 */
public class NimitzRangeCond extends AlipayObject {

	private static final long serialVersionUID = 7395491869339781353L;

	/**
	 * 范围条件key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 范围条件value
	 */
	@ApiField("range")
	private NimitzRange range;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public NimitzRange getRange() {
		return this.range;
	}
	public void setRange(NimitzRange range) {
		this.range = range;
	}

}
