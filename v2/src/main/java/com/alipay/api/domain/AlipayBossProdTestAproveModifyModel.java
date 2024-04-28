package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跳审改造
 *
 * @author auto create
 * @since 1.0, 2023-07-19 15:22:15
 */
public class AlipayBossProdTestAproveModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8366585486642113189L;

	/**
	 * tet
	 */
	@ApiField("complex_copy")
	private PublicComplex complexCopy;

	/**
	 * test
	 */
	@ApiField("complex_ref")
	private PublicComplex complexRef;

	/**
	 * test 当前字段已废弃(test废弃原因测试)
	 */
	@ApiField("test_a")
	@Deprecated
	private String testA;

	/**
	 * test
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * test
	 */
	@ApiField("test_string_open_id")
	private String testStringOpenId;

	public PublicComplex getComplexCopy() {
		return this.complexCopy;
	}
	public void setComplexCopy(PublicComplex complexCopy) {
		this.complexCopy = complexCopy;
	}

	public PublicComplex getComplexRef() {
		return this.complexRef;
	}
	public void setComplexRef(PublicComplex complexRef) {
		this.complexRef = complexRef;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public String getTestString() {
		return this.testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}

	public String getTestStringOpenId() {
		return this.testStringOpenId;
	}
	public void setTestStringOpenId(String testStringOpenId) {
		this.testStringOpenId = testStringOpenId;
	}

}
