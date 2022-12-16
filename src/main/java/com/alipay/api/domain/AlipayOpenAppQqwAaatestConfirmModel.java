package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aaatest
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:55:09
 */
public class AlipayOpenAppQqwAaatestConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3438341187789673111L;

	/**
	 * 1
	 */
	@ApiField("json")
	private String json;

	public String getJson() {
		return this.json;
	}
	public void setJson(String json) {
		this.json = json;
	}

}
