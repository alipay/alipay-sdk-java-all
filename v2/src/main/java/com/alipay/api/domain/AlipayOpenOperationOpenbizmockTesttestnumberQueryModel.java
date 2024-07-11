package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试number类型
 *
 * @author auto create
 * @since 1.0, 2023-12-12 20:10:53
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8759961997785851314L;

	/**
	 * 1
	 */
	@ApiField("a")
	private Long a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("keykey")
	private Long keykey;

	/**
	 * test
	 */
	@ApiField("test_1")
	private String test1;

	/**
	 * tst
	 */
	@ApiField("test_2")
	private String test2;

	public Long getA() {
		return this.a;
	}
	public void setA(Long a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public Long getKeykey() {
		return this.keykey;
	}
	public void setKeykey(Long keykey) {
		this.keykey = keykey;
	}

	public String getTest1() {
		return this.test1;
	}
	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return this.test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}

}
