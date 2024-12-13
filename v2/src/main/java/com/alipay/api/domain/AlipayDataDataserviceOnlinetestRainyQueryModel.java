package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上接口问题复现
 *
 * @author auto create
 * @since 1.0, 2024-12-11 14:55:08
 */
public class AlipayDataDataserviceOnlinetestRainyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4245881751196495837L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

}
