package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:42
 */
public class AlipaySecurityRiskVerifyidentityInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1274598975633675631L;

	/** 
	 * 返回给调用方的数据集合，具体数据由对接过程中双方共同确认
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误原因说明
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误码身份核实校验结果失败时，返回的失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 核身初始化是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 核身页面url
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	/** 
	 * 核身校验token，核身会话中唯一性token，用于后续核身结果二次校验时参数传入
	 */
	@ApiField("veritfy_token")
	private String veritfyToken;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}
	public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

	public void setVeritfyToken(String veritfyToken) {
		this.veritfyToken = veritfyToken;
	}
	public String getVeritfyToken( ) {
		return this.veritfyToken;
	}

}
