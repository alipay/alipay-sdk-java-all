package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试number类型
 *
 * @author auto create
 * @since 1.0, 2023-05-31 15:26:41
 */
public class AlipayOpenOperationOpenbizmockTesttestnumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8365652776517483159L;

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
