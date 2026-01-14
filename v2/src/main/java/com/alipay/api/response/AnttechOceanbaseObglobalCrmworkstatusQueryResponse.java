package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.crmworkstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AnttechOceanbaseObglobalCrmworkstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4733862153678297455L;

	/** 
	 * VALIDATION_FAIL
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/** 
	 * true
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * suspended：停用 un_suspended：非停用  null：未查询到相关信息或者查询失败
	 */
	@ApiField("result")
	private String result;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}
	public String getBizErrorMsg( ) {
		return this.bizErrorMsg;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
