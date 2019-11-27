package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改情景智能
 *
 * @author auto create
 * @since 1.0, 2019-06-12 20:01:39
 */
public class AlipayDataAiserviceSmartsceneModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6155735685415791515L;

	/**
	 * dfs
	 */
	@ApiField("hello")
	private String hello;

	public String getHello() {
		return this.hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}

}
