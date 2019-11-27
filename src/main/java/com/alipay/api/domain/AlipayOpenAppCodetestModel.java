package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一对外错误码测试
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayOpenAppCodetestModel extends AlipayObject {

	private static final long serialVersionUID = 7738885757782566229L;

	/**
	 * 测试参数1
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * 测试参数2
	 */
	@ApiField("testparamparam")
	private String testparamparam;

	public String getTestparam() {
		return this.testparam;
	}
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	public String getTestparamparam() {
		return this.testparamparam;
	}
	public void setTestparamparam(String testparamparam) {
		this.testparamparam = testparamparam;
	}

}
