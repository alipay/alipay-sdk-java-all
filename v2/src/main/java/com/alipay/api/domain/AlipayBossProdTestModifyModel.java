package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口支持参数校验
 *
 * @author auto create
 * @since 1.0, 2023-07-17 17:18:18
 */
public class AlipayBossProdTestModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1634989328588412687L;

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
	@ApiField("test_price")
	private String testPrice;

	/**
	 * test
	 */
	@ApiField("test_string")
	private String testString;

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

}
