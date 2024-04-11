package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * tsetaa
 *
 * @author auto create
 * @since 1.0, 2024-02-23 10:24:40
 */
public class AlipaySecurityOpenbizmockTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2875758733861573655L;

	/**
	 * test
	 */
	@ApiListField("complex")
	@ApiField("public_complex")
	private List<PublicComplex> complex;

	/**
	 * test
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * TEST
	 */
	@ApiField("mobile_number")
	private String mobileNumber;

	/**
	 * test
	 */
	@ApiListField("test_boolean")
	@ApiField("boolean")
	private List<Boolean> testBoolean;

	/**
	 * ["2021-01-01"]
	 */
	@ApiListField("test_date")
	@ApiField("date")
	private List<Date> testDate;

	/**
	 * [2,3]
	 */
	@ApiListField("test_number")
	@ApiField("number")
	private List<Long> testNumber;

	/**
	 * [1.33,2.33]
	 */
	@ApiListField("test_price")
	@ApiField("price")
	private List<String> testPrice;

	/**
	 * string1
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * ["string1","string2"]
	 */
	@ApiListField("test_string_not_list")
	@ApiField("string")
	private List<String> testStringNotList;

	public List<PublicComplex> getComplex() {
		return this.complex;
	}
	public void setComplex(List<PublicComplex> complex) {
		this.complex = complex;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Boolean> getTestBoolean() {
		return this.testBoolean;
	}
	public void setTestBoolean(List<Boolean> testBoolean) {
		this.testBoolean = testBoolean;
	}

	public List<Date> getTestDate() {
		return this.testDate;
	}
	public void setTestDate(List<Date> testDate) {
		this.testDate = testDate;
	}

	public List<Long> getTestNumber() {
		return this.testNumber;
	}
	public void setTestNumber(List<Long> testNumber) {
		this.testNumber = testNumber;
	}

	public List<String> getTestPrice() {
		return this.testPrice;
	}
	public void setTestPrice(List<String> testPrice) {
		this.testPrice = testPrice;
	}

	public String getTestString() {
		return this.testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}

	public List<String> getTestStringNotList() {
		return this.testStringNotList;
	}
	public void setTestStringNotList(List<String> testStringNotList) {
		this.testStringNotList = testStringNotList;
	}

}
