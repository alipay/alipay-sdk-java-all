package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2022-08-01 17:04:54
 */
public class Marketingtest extends AlipayObject {

	private static final long serialVersionUID = 5849597916432196948L;

	/**
	 * 测试描述
	 */
	@ApiField("test_21")
	private String test21;

	public String getTest21() {
		return this.test21;
	}
	public void setTest21(String test21) {
		this.test21 = test21;
	}

}
