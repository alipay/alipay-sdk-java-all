package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jhj预发测试
 *
 * @author auto create
 * @since 1.0, 2023-09-06 18:02:49
 */
public class AlipayDataDataserviceDataJhjtestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7826564345633752118L;

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
	 * 111
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

}
