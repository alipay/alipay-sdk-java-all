package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.traffic.code.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayEcoTrafficCodeVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2621321295266247684L;

	/** 
	 * 解码是否成功
	 */
	@ApiField("decode_success")
	private String decodeSuccess;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 解析模式：QRCODE/RECORD
	 */
	@ApiField("parse_mode")
	private String parseMode;

	/** 
	 * 描述本次执行结果详情
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否调用成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 验码是否成功
	 */
	@ApiField("verify_success")
	private String verifySuccess;

	public void setDecodeSuccess(String decodeSuccess) {
		this.decodeSuccess = decodeSuccess;
	}
	public String getDecodeSuccess( ) {
		return this.decodeSuccess;
	}

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

	public void setParseMode(String parseMode) {
		this.parseMode = parseMode;
	}
	public String getParseMode( ) {
		return this.parseMode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setVerifySuccess(String verifySuccess) {
		this.verifySuccess = verifySuccess;
	}
	public String getVerifySuccess( ) {
		return this.verifySuccess;
	}

}
