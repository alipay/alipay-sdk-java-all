package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.face.verify.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZolozAuthenticationFaceVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7348187488953953771L;

	/** 
	 * 返回详细码
	 */
	@ApiField("ret_code_sub")
	private String retCodeSub;

	/** 
	 * 返回详细信息
	 */
	@ApiField("ret_message_sub")
	private String retMessageSub;

	/** 
	 * 测试
	 */
	@ApiField("test_result")
	private String testResult;

	public void setRetCodeSub(String retCodeSub) {
		this.retCodeSub = retCodeSub;
	}
	public String getRetCodeSub( ) {
		return this.retCodeSub;
	}

	public void setRetMessageSub(String retMessageSub) {
		this.retMessageSub = retMessageSub;
	}
	public String getRetMessageSub( ) {
		return this.retMessageSub;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	public String getTestResult( ) {
		return this.testResult;
	}

}
