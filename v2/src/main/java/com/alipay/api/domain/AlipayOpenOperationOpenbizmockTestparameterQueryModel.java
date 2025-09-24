package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试参数校验接口
 *
 * @author auto create
 * @since 1.0, 2023-08-21 16:29:10
 */
public class AlipayOpenOperationOpenbizmockTestparameterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3295652248541738917L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("appid_one")
	private String appidOne;

	/**
	 * 1
	 */
	@ApiField("appid_out_one")
	private String appidOutOne;

	/**
	 * 1
	 */
	@ApiField("appid_out_two")
	private String appidOutTwo;

	/**
	 * 1
	 */
	@ApiField("appid_two")
	private String appidTwo;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 1
	 */
	@ApiField("e")
	private Boolean e;

	/**
	 * 1
	 */
	@ApiField("f")
	private String f;

	/**
	 * 1
	 */
	@ApiField("number")
	private Long number;

	/**
	 * 1
	 */
	@ApiField("one_uid")
	private String oneUid;

	/**
	 * 1
	 */
	@ApiField("one_uid_openid")
	private String oneUidOpenid;

	/**
	 * 1
	 */
	@ApiField("price")
	private String price;

	/**
	 * 1
	 */
	@ApiListField("ss_list")
	@ApiField("string")
	private List<String> ssList;

	/**
	 * 1
	 */
	@ApiField("test")
	private OpenidComplex test;

	/**
	 * 111
	 */
	@ApiField("test_test")
	private OpenidComplex testTest;

	/**
	 * 1
	 */
	@ApiField("two_uid")
	private String twoUid;

	/**
	 * 1
	 */
	@ApiField("two_uid_openid")
	private String twoUidOpenid;

	/**
	 * 1
	 */
	@ApiField("uid_one")
	private String uidOne;

	/**
	 * 1
	 */
	@ApiField("uid_two")
	private String uidTwo;

	/**
	 * 1
	 */
	@ApiField("uidone_openid")
	private String uidoneOpenid;

	/**
	 * 1
	 */
	@ApiField("uidtwo_openid")
	private String uidtwoOpenid;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getAppidOne() {
		return this.appidOne;
	}
	public void setAppidOne(String appidOne) {
		this.appidOne = appidOne;
	}

	public String getAppidOutOne() {
		return this.appidOutOne;
	}
	public void setAppidOutOne(String appidOutOne) {
		this.appidOutOne = appidOutOne;
	}

	public String getAppidOutTwo() {
		return this.appidOutTwo;
	}
	public void setAppidOutTwo(String appidOutTwo) {
		this.appidOutTwo = appidOutTwo;
	}

	public String getAppidTwo() {
		return this.appidTwo;
	}
	public void setAppidTwo(String appidTwo) {
		this.appidTwo = appidTwo;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getE() {
		return this.e;
	}
	public void setE(Boolean e) {
		this.e = e;
	}

	public String getF() {
		return this.f;
	}
	public void setF(String f) {
		this.f = f;
	}

	public Long getNumber() {
		return this.number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}

	public String getOneUid() {
		return this.oneUid;
	}
	public void setOneUid(String oneUid) {
		this.oneUid = oneUid;
	}

	public String getOneUidOpenid() {
		return this.oneUidOpenid;
	}
	public void setOneUidOpenid(String oneUidOpenid) {
		this.oneUidOpenid = oneUidOpenid;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public List<String> getSsList() {
		return this.ssList;
	}
	public void setSsList(List<String> ssList) {
		this.ssList = ssList;
	}

	public OpenidComplex getTest() {
		return this.test;
	}
	public void setTest(OpenidComplex test) {
		this.test = test;
	}

	public OpenidComplex getTestTest() {
		return this.testTest;
	}
	public void setTestTest(OpenidComplex testTest) {
		this.testTest = testTest;
	}

	public String getTwoUid() {
		return this.twoUid;
	}
	public void setTwoUid(String twoUid) {
		this.twoUid = twoUid;
	}

	public String getTwoUidOpenid() {
		return this.twoUidOpenid;
	}
	public void setTwoUidOpenid(String twoUidOpenid) {
		this.twoUidOpenid = twoUidOpenid;
	}

	public String getUidOne() {
		return this.uidOne;
	}
	public void setUidOne(String uidOne) {
		this.uidOne = uidOne;
	}

	public String getUidTwo() {
		return this.uidTwo;
	}
	public void setUidTwo(String uidTwo) {
		this.uidTwo = uidTwo;
	}

	public String getUidoneOpenid() {
		return this.uidoneOpenid;
	}
	public void setUidoneOpenid(String uidoneOpenid) {
		this.uidoneOpenid = uidoneOpenid;
	}

	public String getUidtwoOpenid() {
		return this.uidtwoOpenid;
	}
	public void setUidtwoOpenid(String uidtwoOpenid) {
		this.uidtwoOpenid = uidtwoOpenid;
	}

}
