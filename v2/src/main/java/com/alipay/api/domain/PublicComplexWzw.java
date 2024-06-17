package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * wzw公有复杂类型
 *
 * @author auto create
 * @since 1.0, 2024-01-10 16:38:28
 */
public class PublicComplexWzw extends AlipayObject {

	private static final long serialVersionUID = 4457686197249424632L;

	/**
	 * test
	 */
	@ApiField("complex_a")
	private CorporateSealRectOpenVO complexA;

	/**
	 * test
	 */
	@ApiListField("test_boolean")
	@ApiField("boolean")
	private List<Boolean> testBoolean;

	/**
	 * test
	 */
	@ApiListField("test_number")
	@ApiField("number")
	private List<Long> testNumber;

	/**
	 * 1
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * 1
	 */
	@ApiField("test_string_open_id")
	private String testStringOpenId;

	public CorporateSealRectOpenVO getComplexA() {
		return this.complexA;
	}
	public void setComplexA(CorporateSealRectOpenVO complexA) {
		this.complexA = complexA;
	}

	public List<Boolean> getTestBoolean() {
		return this.testBoolean;
	}
	public void setTestBoolean(List<Boolean> testBoolean) {
		this.testBoolean = testBoolean;
	}

	public List<Long> getTestNumber() {
		return this.testNumber;
	}
	public void setTestNumber(List<Long> testNumber) {
		this.testNumber = testNumber;
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
