package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ddd
 *
 * @author auto create
 * @since 1.0, 2018-06-11 14:04:01
 */
public class MyObjectDdd extends AlipayObject {

	private static final long serialVersionUID = 8321387338275588932L;

	/**
	 * xxx
	 */
	@ApiField("param")
	private String param;

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

}
