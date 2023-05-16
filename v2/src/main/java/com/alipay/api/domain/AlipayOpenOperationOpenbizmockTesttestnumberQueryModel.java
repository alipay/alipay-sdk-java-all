package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试number类型
 *
 * @author auto create
 * @since 1.0, 2023-02-09 19:26:26
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1377898671658749468L;

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
	@ApiField("keykey")
	private Long keykey;

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

	public Long getKeykey() {
		return this.keykey;
	}
	public void setKeykey(Long keykey) {
		this.keykey = keykey;
	}

}
