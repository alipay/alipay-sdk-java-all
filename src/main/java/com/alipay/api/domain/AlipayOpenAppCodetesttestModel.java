package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一对外错误码测试测试
 *
 * @author auto create
 * @since 1.0, 2016-05-11 19:51:24
 */
public class AlipayOpenAppCodetesttestModel extends AlipayObject {

	private static final long serialVersionUID = 7733435128186145898L;

	/**
	 * 测试参数1
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * 测试测试
	 */
	@ApiField("testtestparam")
	private String testtestparam;

	public String getTestparam() {
		return this.testparam;
	}
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	public String getTesttestparam() {
		return this.testtestparam;
	}
	public void setTesttestparam(String testtestparam) {
		this.testtestparam = testtestparam;
	}

}
