package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISP运行链路测试复杂类型
 *
 * @author auto create
 * @since 1.0, 2022-08-19 10:32:24
 */
public class HahaIspTestDO extends AlipayObject {

	private static final long serialVersionUID = 6324638164545363792L;

	/**
	 * 32
	 */
	@ApiField("one")
	private String one;

	/**
	 * 32
	 */
	@ApiField("two")
	private String two;

	public String getOne() {
		return this.one;
	}
	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return this.two;
	}
	public void setTwo(String two) {
		this.two = two;
	}

}
