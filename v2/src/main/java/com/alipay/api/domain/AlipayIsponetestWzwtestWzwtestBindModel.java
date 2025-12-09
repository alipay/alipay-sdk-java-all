package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口质量迭代
 *
 * @author auto create
 * @since 1.0, 2023-09-06 19:17:43
 */
public class AlipayIsponetestWzwtestWzwtestBindModel extends AlipayObject {

	private static final long serialVersionUID = 6437682617954552539L;

	/**
	 * test
	 */
	@ApiField("complex_1")
	private TestDemoWzw complex1;

	/**
	 * Number_c
	 */
	@ApiField("number_c")
	private Long numberC;

	/**
	 * number_d
	 */
	@ApiField("number_d")
	private Long numberD;

	/**
	 * sss
	 */
	@ApiField("string")
	private String string;

	/**
	 * string_a
	 */
	@ApiField("string_a")
	private String stringA;

	/**
	 * string_b
	 */
	@ApiField("string_b")
	private String stringB;

	public TestDemoWzw getComplex1() {
		return this.complex1;
	}
	public void setComplex1(TestDemoWzw complex1) {
		this.complex1 = complex1;
	}

	public Long getNumberC() {
		return this.numberC;
	}
	public void setNumberC(Long numberC) {
		this.numberC = numberC;
	}

	public Long getNumberD() {
		return this.numberD;
	}
	public void setNumberD(Long numberD) {
		this.numberD = numberD;
	}

	public String getString() {
		return this.string;
	}
	public void setString(String string) {
		this.string = string;
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

}
