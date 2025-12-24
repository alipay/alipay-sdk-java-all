package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上问题回归测试验证02无参数
 *
 * @author auto create
 * @since 1.0, 2025-06-23 20:13:56
 */
public class AlipayDataDataserviceOnlineerrorRainyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7771552743565672417L;

	/**
	 * 第五个复杂类型
	 */
	@ApiField("complex_type_twice")
	private RainyComplexTypesTheSecond complexTypeTwice;

	/**
	 * 234
	 */
	@ApiField("test_case_complex_input")
	private RainyComplexTypesTheFirst testCaseComplexInput;

	/**
	 * 是否必选
	 */
	@ApiField("test_case_is_must_input")
	private String testCaseIsMustInput;

	public RainyComplexTypesTheSecond getComplexTypeTwice() {
		return this.complexTypeTwice;
	}
	public void setComplexTypeTwice(RainyComplexTypesTheSecond complexTypeTwice) {
		this.complexTypeTwice = complexTypeTwice;
	}

	public RainyComplexTypesTheFirst getTestCaseComplexInput() {
		return this.testCaseComplexInput;
	}
	public void setTestCaseComplexInput(RainyComplexTypesTheFirst testCaseComplexInput) {
		this.testCaseComplexInput = testCaseComplexInput;
	}

	public String getTestCaseIsMustInput() {
		return this.testCaseIsMustInput;
	}
	public void setTestCaseIsMustInput(String testCaseIsMustInput) {
		this.testCaseIsMustInput = testCaseIsMustInput;
	}

}
