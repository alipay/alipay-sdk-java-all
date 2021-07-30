package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试msgapi
 *
 * @author auto create
 * @since 1.0, 2018-10-15 18:57:55
 */
public class AlipayOpenAppTestapiiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6821678931929445888L;

	/**
	 * v
	 */
	@ApiField("in_1")
	private String in1;

	/**
	 * b
	 */
	@ApiField("in_2")
	private String in2;

	public String getIn1() {
		return this.in1;
	}
	public void setIn1(String in1) {
		this.in1 = in1;
	}

	public String getIn2() {
		return this.in2;
	}
	public void setIn2(String in2) {
		this.in2 = in2;
	}

}
