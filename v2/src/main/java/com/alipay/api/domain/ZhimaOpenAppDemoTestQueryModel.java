package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试文档预览
 *
 * @author auto create
 * @since 1.0, 2023-11-30 10:44:40
 */
public class ZhimaOpenAppDemoTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8382152496672574788L;

	/**
	 * copy_complex
	 */
	@ApiListField("copy_complex")
	@ApiField("public_complex")
	private List<PublicComplex> copyComplex;

	/**
	 * 方法
	 */
	@ApiField("platform_a")
	private String platformA;

	/**
	 * test
	 */
	@ApiField("ref_complex")
	private PublicComplex refComplex;

	/**
	 * 1
	 */
	@ApiField("test_1")
	private String test1;

	/**
	 * 1
	 */
	@ApiField("test_date")
	private String testDate;

	/**
	 * 1 当前字段已废弃(111111111111)
	 */
	@ApiField("test_number")
	@Deprecated
	private String testNumber;

	/**
	 * test
	 */
	@ApiField("test_other")
	private String testOther;

	/**
	 * 1
	 */
	@ApiField("test_price")
	private String testPrice;

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

	public List<PublicComplex> getCopyComplex() {
		return this.copyComplex;
	}
	public void setCopyComplex(List<PublicComplex> copyComplex) {
		this.copyComplex = copyComplex;
	}

	public String getPlatformA() {
		return this.platformA;
	}
	public void setPlatformA(String platformA) {
		this.platformA = platformA;
	}

	public PublicComplex getRefComplex() {
		return this.refComplex;
	}
	public void setRefComplex(PublicComplex refComplex) {
		this.refComplex = refComplex;
	}

	public String getTest1() {
		return this.test1;
	}
	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTestDate() {
		return this.testDate;
	}
	public void setTestDate(String testDate) {
		this.testDate = testDate;
	}

	public String getTestNumber() {
		return this.testNumber;
	}
	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}

	public String getTestOther() {
		return this.testOther;
	}
	public void setTestOther(String testOther) {
		this.testOther = testOther;
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

	public String getTestStringOpenId() {
		return this.testStringOpenId;
	}
	public void setTestStringOpenId(String testStringOpenId) {
		this.testStringOpenId = testStringOpenId;
	}

}
