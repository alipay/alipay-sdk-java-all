package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部资源
 *
 * @author auto create
 * @since 1.0, 2023-07-19 20:27:10
 */
public class AlipayBossProdTestAproveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8195777137973581117L;

	/**
	 * test
	 */
	@ApiField("complex_a")
	private PublicComplex complexA;

	/**
	 * test
	 */
	@ApiField("complex_b")
	private PublicComplex complexB;

	/**
	 * test
	 */
	@ApiField("test_open_id")
	private String testOpenId;

	/**
	 * test
	 */
	@ApiField("test_uid")
	private String testUid;

	public PublicComplex getComplexA() {
		return this.complexA;
	}
	public void setComplexA(PublicComplex complexA) {
		this.complexA = complexA;
	}

	public PublicComplex getComplexB() {
		return this.complexB;
	}
	public void setComplexB(PublicComplex complexB) {
		this.complexB = complexB;
	}

	public String getTestOpenId() {
		return this.testOpenId;
	}
	public void setTestOpenId(String testOpenId) {
		this.testOpenId = testOpenId;
	}

	public String getTestUid() {
		return this.testUid;
	}
	public void setTestUid(String testUid) {
		this.testUid = testUid;
	}

}
