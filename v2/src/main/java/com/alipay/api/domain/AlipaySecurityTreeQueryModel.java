package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 老模型测试极速版
 *
 * @author auto create
 * @since 1.0, 2026-06-04 15:59:19
 */
public class AlipaySecurityTreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4237613231296634233L;

	/**
	 * 测试2
	 */
	@ApiField("test")
	private String test;

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
