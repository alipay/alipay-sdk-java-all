package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.demo.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:14
 */
public class ZhimaOpenAppDemoTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7598767838292377242L;

	/** 
	 * 方法
	 */
	@ApiField("platform_a")
	private String platformA;

	/** 
	 * 1
	 */
	@ApiField("test_2")
	private String test2;

	/** 
	 * 1
	 */
	@ApiField("test_6")
	private String test6;

	/** 
	 * 1
	 */
	@ApiField("test_id")
	private String testId;

	/** 
	 * 1
	 */
	@ApiField("test_id_open_id")
	private String testIdOpenId;

	/** 
	 * 1
	 */
	@ApiField("test_number")
	private String testNumber;

	public void setPlatformA(String platformA) {
		this.platformA = platformA;
	}
	public String getPlatformA( ) {
		return this.platformA;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}
	public String getTest2( ) {
		return this.test2;
	}

	public void setTest6(String test6) {
		this.test6 = test6;
	}
	public String getTest6( ) {
		return this.test6;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}
	public String getTestId( ) {
		return this.testId;
	}

	public void setTestIdOpenId(String testIdOpenId) {
		this.testIdOpenId = testIdOpenId;
	}
	public String getTestIdOpenId( ) {
		return this.testIdOpenId;
	}

	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}
	public String getTestNumber( ) {
		return this.testNumber;
	}

}
