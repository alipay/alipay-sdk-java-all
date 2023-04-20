package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试网关支持number类型
 *
 * @author auto create
 * @since 1.0, 2023-02-09 19:03:34
 */
public class AlipayOpenOperationOpenbizmockTestnumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7626633771774818674L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("keykey")
	private String keykey;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getKeykey() {
		return this.keykey;
	}
	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}

}
