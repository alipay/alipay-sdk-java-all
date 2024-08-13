package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * testopenapi
 *
 * @author auto create
 * @since 1.0, 2023-11-28 15:40:56
 */
public class AlipayOpenAzeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1873175997831485818L;

	/**
	 * 你好
	 */
	@ApiField("arg_name")
	private String argName;

	/**
	 * openapi测试
	 */
	@ApiField("open_test")
	private String openTest;

	public String getArgName() {
		return this.argName;
	}
	public void setArgName(String argName) {
		this.argName = argName;
	}

	public String getOpenTest() {
		return this.openTest;
	}
	public void setOpenTest(String openTest) {
		this.openTest = openTest;
	}

}
