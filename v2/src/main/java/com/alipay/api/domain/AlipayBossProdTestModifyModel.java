package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接口支持参数校验
 *
 * @author auto create
 * @since 1.0, 2023-07-24 14:58:28
 */
public class AlipayBossProdTestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3347812874371264784L;

	/**
	 * test
	 */
	@ApiField("complex_copy")
	private PublicComplex complexCopy;

	/**
	 * test
	 */
	@ApiField("complex_copy_2")
	private PublicComplexWzw complexCopy2;

	/**
	 * tet
	 */
	@ApiField("complex_ref")
	private PublicComplex complexRef;

	/**
	 * test
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * test
	 */
	@ApiField("test_boolean")
	private Boolean testBoolean;

	/**
	 * test
	 */
	@ApiField("test_date")
	private Date testDate;

	/**
	 * test
	 */
	@ApiField("test_number")
	private Long testNumber;

	/**
	 * test
	 */
	@ApiField("test_number_2")
	private Long testNumber2;

	/**
	 * test
	 */
	@ApiField("test_price")
	private String testPrice;

	/**
	 * test
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * test
	 */
	@ApiListField("test_string_open_ids")
	@ApiField("string")
	private List<String> testStringOpenIds;

	public PublicComplex getComplexCopy() {
		return this.complexCopy;
	}
	public void setComplexCopy(PublicComplex complexCopy) {
		this.complexCopy = complexCopy;
	}

	public PublicComplexWzw getComplexCopy2() {
		return this.complexCopy2;
	}
	public void setComplexCopy2(PublicComplexWzw complexCopy2) {
		this.complexCopy2 = complexCopy2;
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

	public Boolean getTestBoolean() {
		return this.testBoolean;
	}
	public void setTestBoolean(Boolean testBoolean) {
		this.testBoolean = testBoolean;
	}

	public Date getTestDate() {
		return this.testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Long getTestNumber() {
		return this.testNumber;
	}
	public void setTestNumber(Long testNumber) {
		this.testNumber = testNumber;
	}

	public Long getTestNumber2() {
		return this.testNumber2;
	}
	public void setTestNumber2(Long testNumber2) {
		this.testNumber2 = testNumber2;
	}

	public String getTestPrice() {
		return this.testPrice;
	}
	public void setTestPrice(String testPrice) {
		this.testPrice = testPrice;
	}

	public String getTestString() {
		return this.testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}

	public List<String> getTestStringOpenIds() {
		return this.testStringOpenIds;
	}
	public void setTestStringOpenIds(List<String> testStringOpenIds) {
		this.testStringOpenIds = testStringOpenIds;
	}

}
