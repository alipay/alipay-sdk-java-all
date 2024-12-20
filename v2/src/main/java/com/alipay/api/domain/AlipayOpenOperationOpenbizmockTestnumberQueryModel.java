package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试网关支持number类型
 *
 * @author auto create
 * @since 1.0, 2023-06-10 18:37:31
 */
public class AlipayOpenOperationOpenbizmockTestnumberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1356235867195946153L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

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

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getKeykey() {
		return this.keykey;
	}
	public void setKeykey(String keykey) {
		this.keykey = keykey;
	}

}
