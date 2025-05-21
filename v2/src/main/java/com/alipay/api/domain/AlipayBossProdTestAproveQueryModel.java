package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部资源
 *
 * @author auto create
 * @since 1.0, 2024-07-01 15:43:12
 */
public class AlipayBossProdTestAproveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7285619781549124536L;

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
	@ApiField("platform_a")
	private String platformA;

	/**
	 * 秒速
	 */
	@ApiField("platform_complex_a")
	private Apitestjhj platformComplexA;

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

	public String getPlatformA() {
		return this.platformA;
	}
	public void setPlatformA(String platformA) {
		this.platformA = platformA;
	}

	public Apitestjhj getPlatformComplexA() {
		return this.platformComplexA;
	}
	public void setPlatformComplexA(Apitestjhj platformComplexA) {
		this.platformComplexA = platformComplexA;
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
