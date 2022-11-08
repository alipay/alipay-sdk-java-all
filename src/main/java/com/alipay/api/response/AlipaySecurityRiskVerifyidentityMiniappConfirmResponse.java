package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.miniapp.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-21 10:02:01
 */
public class AlipaySecurityRiskVerifyidentityMiniappConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8687475546114625288L;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误原因说明
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 身份核验结果
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}
	public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
