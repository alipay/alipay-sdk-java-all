package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.juneng.loan.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:47:00
 */
public class AlipayDataAiserviceJunengLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3137312582191167515L;

	/** 
	 * 二级错误码，帮助诊断错误
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 用户身份证的md5加密值
	 */
	@ApiField("hashed_cert_no")
	private String hashedCertNo;

	/** 
	 * 本次请求的uuid
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	/** 
	 * 接口的返回结果
	 */
	@ApiField("result")
	private String result;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setHashedCertNo(String hashedCertNo) {
		this.hashedCertNo = hashedCertNo;
	}
	public String getHashedCertNo( ) {
		return this.hashedCertNo;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}
	public String getRequestUuid( ) {
		return this.requestUuid;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
