package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字段隐藏与废弃openapi接口
 *
 * @author auto create
 * @since 1.0, 2023-05-17 20:19:31
 */
public class AlipayIsponetestWzwtestWzwtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8275162862934665731L;

	/**
	 * test
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * 22
	 */
	@ApiField("aaaa")
	private String aaaa;

	/**
	 * 33
	 */
	@ApiField("bbbb")
	private String bbbb;

	/**
	 * 2
	 */
	@ApiField("ccc")
	private String ccc;

	/**
	 * test 当前字段已废弃(test废弃字段测试)
	 */
	@ApiField("complex_a")
	@Deprecated
	private TestDemo complexA;

	/**
	 * test
	 */
	@ApiField("complex_b")
	private String complexB;

	/**
	 * test 当前字段已废弃(test废弃原因测试)
	 */
	@ApiField("string_a")
	@Deprecated
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

	public String getAaaa() {
		return this.aaaa;
	}
	public void setAaaa(String aaaa) {
		this.aaaa = aaaa;
	}

	public String getBbbb() {
		return this.bbbb;
	}
	public void setBbbb(String bbbb) {
		this.bbbb = bbbb;
	}

	public String getCcc() {
		return this.ccc;
	}
	public void setCcc(String ccc) {
		this.ccc = ccc;
	}

	public TestDemo getComplexA() {
		return this.complexA;
	}
	public void setComplexA(TestDemo complexA) {
		this.complexA = complexA;
	}

	public String getComplexB() {
		return this.complexB;
	}
	public void setComplexB(String complexB) {
		this.complexB = complexB;
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
