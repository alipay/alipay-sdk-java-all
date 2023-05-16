package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字段隐藏与废弃openapi接口
 *
 * @author auto create
 * @since 1.0, 2023-05-16 16:21:17
 */
public class AlipayIsponetestWzwtestWzwtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1293713877655374968L;

	/**
	 * test
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * test
	 */
	@ApiField("complex_a")
	private TestDemo complexA;

	/**
	 * test
	 */
	@ApiField("string_a")
	private String stringA;

	/**
	 * test
	 */
	@ApiField("string_b")
	private String stringB;

	/**
	 * test
	 */
	@ApiField("uid_a")
	private String uidA;

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public TestDemo getComplexA() {
		return this.complexA;
	}
	public void setComplexA(TestDemo complexA) {
		this.complexA = complexA;
	}

	public String getStringA() {
		return this.stringA;
	}
	public void setStringA(String stringA) {
		this.stringA = stringA;
	}

	public String getStringB() {
		return this.stringB;
	}
	public void setStringB(String stringB) {
		this.stringB = stringB;
	}

	public String getUidA() {
		return this.uidA;
	}
	public void setUidA(String uidA) {
		this.uidA = uidA;
	}

}
