package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 丹尼需要推到公开的接口
 *
 * @author auto create
 * @since 1.0, 2022-07-09 14:14:04
 */
public class AlipaySecurityDanielTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8461253719635865712L;

	/**
	 * 1
	 */
	@ApiField("input_query")
	private String inputQuery;

	public String getInputQuery() {
		return this.inputQuery;
	}
	public void setInputQuery(String inputQuery) {
		this.inputQuery = inputQuery;
	}

}
