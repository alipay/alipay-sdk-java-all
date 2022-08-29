package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.poi.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-14 22:01:12
 */
public class AlipayOverseasTravelFliggyPoiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2834756195121454692L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误消息提示
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 回调结果的结果标示
	 */
	@ApiField("success")
	private Boolean success;

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
