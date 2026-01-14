package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * wzw公有complex
 *
 * @author auto create
 * @since 1.0, 2024-07-01 15:20:06
 */
public class PublicComplex extends AlipayObject {

	private static final long serialVersionUID = 6528477733529743822L;

	/**
	 * test
	 */
	@ApiField("complex_testa")
	private PublicComplexWzw complexTesta;

	/**
	 * 1test
	 */
	@ApiListField("test_boolean")
	@ApiField("boolean")
	private List<Boolean> testBoolean;

	/**
	 * test
	 */
	@ApiField("test_date")
	private Date testDate;

	/**
	 * test
	 */
	@ApiField("test_new")
	private String testNew;

	/**
	 * test
	 */
	@ApiListField("test_number")
	@ApiField("number")
	private List<Long> testNumber;

	/**
	 * test
	 */
	@ApiListField("test_price")
	@ApiField("price")
	private List<String> testPrice;

	/**
	 * test
	 */
	@ApiField("test_string")
	private String testString;

	/**
	 * test
	 */
	@ApiField("test_string_open_id")
	private String testStringOpenId;

	/**
	 * 1 当前字段已废弃(test废弃参数N选一分组)
	 */
	@ApiField("update_test")
	@Deprecated
	private String updateTest;

	public PublicComplexWzw getComplexTesta() {
		return this.complexTesta;
	}
	public void setComplexTesta(PublicComplexWzw complexTesta) {
		this.complexTesta = complexTesta;
	}

	public List<Boolean> getTestBoolean() {
		return this.testBoolean;
	}
	public void setTestBoolean(List<Boolean> testBoolean) {
		this.testBoolean = testBoolean;
	}

	public Date getTestDate() {
		return this.testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public String getTestNew() {
		return this.testNew;
	}
	public void setTestNew(String testNew) {
		this.testNew = testNew;
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

	public String getTestStringOpenId() {
		return this.testStringOpenId;
	}
	public void setTestStringOpenId(String testStringOpenId) {
		this.testStringOpenId = testStringOpenId;
	}

	public String getUpdateTest() {
		return this.updateTest;
	}
	public void setUpdateTest(String updateTest) {
		this.updateTest = updateTest;
	}

}
