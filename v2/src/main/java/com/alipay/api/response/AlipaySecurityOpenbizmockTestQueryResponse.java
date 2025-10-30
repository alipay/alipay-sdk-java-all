package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RegressionPublic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.openbizmock.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AlipaySecurityOpenbizmockTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8156737939715374799L;

	/** 
	 * test
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * test_price
	 */
	@ApiField("mobile_number")
	private String mobileNumber;

	/** 
	 * 1
	 */
	@ApiField("out_a")
	private RegressionPublic outA;

	/** 
	 * 1
	 */
	@ApiField("para_a")
	private String paraA;

	/** 
	 * test_number
	 */
	@ApiField("test_number")
	private Long testNumber;

	/** 
	 * 测试基础描述
	 */
	@ApiField("test_string")
	private String testString;

	/** 
	 * test
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * test
	 */
	@ApiField("uid_openid")
	private String uidOpenid;

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber( ) {
		return this.mobileNumber;
	}

	public void setOutA(RegressionPublic outA) {
		this.outA = outA;
	}
	public RegressionPublic getOutA( ) {
		return this.outA;
	}

	public void setParaA(String paraA) {
		this.paraA = paraA;
	}
	public String getParaA( ) {
		return this.paraA;
	}

	public void setTestNumber(Long testNumber) {
		this.testNumber = testNumber;
	}
	public Long getTestNumber( ) {
		return this.testNumber;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
	public String getTestString( ) {
		return this.testString;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUidOpenid(String uidOpenid) {
		this.uidOpenid = uidOpenid;
	}
	public String getUidOpenid( ) {
		return this.uidOpenid;
	}

}
