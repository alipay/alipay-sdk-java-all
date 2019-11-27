package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试测试
 *
 * @author auto create
 * @since 1.0, 2019-03-12 15:01:09
 */
public class AntProdpaasTestWwfCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7511752165996759539L;

	/**
	 * 测试测试
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
