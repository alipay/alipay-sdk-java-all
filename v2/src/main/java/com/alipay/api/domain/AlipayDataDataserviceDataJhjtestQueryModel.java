package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jhj预发测试
 *
 * @author auto create
 * @since 1.0, 2024-04-19 14:28:20
 */
public class AlipayDataDataserviceDataJhjtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8344761851234177465L;

	/**
	 * 1
	 */
	@ApiField("inner")
	private String inner;

	/**
	 * aa
	 */
	@ApiField("input_a")
	private String inputA;

	/**
	 * aa
	 */
	@ApiField("input_b")
	private String inputB;

	/**
	 * aa
	 */
	@ApiField("input_c")
	private String inputC;

	/**
	 * 文档修改测试，主场景input_c_yincang添加展示
	 */
	@ApiField("input_c_yincang")
	private String inputCYincang;

	/**
	 * 11
	 */
	@ApiField("input_complex_a")
	private PublicComplex inputComplexA;

	/**
	 * aa
	 */
	@ApiField("input_d")
	private String inputD;

	/**
	 * aa
	 */
	@ApiField("input_e")
	private String inputE;

	/**
	 * test
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 文档变更审核通过
	 */
	@ApiField("uid")
	private String uid;

	public String getInner() {
		return this.inner;
	}
	public void setInner(String inner) {
		this.inner = inner;
	}

	public String getInputA() {
		return this.inputA;
	}
	public void setInputA(String inputA) {
		this.inputA = inputA;
	}

	public String getInputB() {
		return this.inputB;
	}
	public void setInputB(String inputB) {
		this.inputB = inputB;
	}

	public String getInputC() {
		return this.inputC;
	}
	public void setInputC(String inputC) {
		this.inputC = inputC;
	}

	public String getInputCYincang() {
		return this.inputCYincang;
	}
	public void setInputCYincang(String inputCYincang) {
		this.inputCYincang = inputCYincang;
	}

	public PublicComplex getInputComplexA() {
		return this.inputComplexA;
	}
	public void setInputComplexA(PublicComplex inputComplexA) {
		this.inputComplexA = inputComplexA;
	}

	public String getInputD() {
		return this.inputD;
	}
	public void setInputD(String inputD) {
		this.inputD = inputD;
	}

	public String getInputE() {
		return this.inputE;
	}
	public void setInputE(String inputE) {
		this.inputE = inputE;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
