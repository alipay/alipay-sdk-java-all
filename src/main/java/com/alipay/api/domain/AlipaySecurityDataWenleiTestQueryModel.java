package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文雷-测试
 *
 * @author auto create
 * @since 1.0, 2017-11-16 11:11:38
 */
public class AlipaySecurityDataWenleiTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7664715227952633786L;

	/**
	 * hello
	 */
	@ApiField("testfield")
	private String testfield;

	public String getTestfield() {
		return this.testfield;
	}
	public void setTestfield(String testfield) {
		this.testfield = testfield;
	}

}
