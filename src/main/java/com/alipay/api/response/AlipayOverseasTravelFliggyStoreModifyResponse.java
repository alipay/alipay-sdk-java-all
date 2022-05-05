package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.fliggy.store.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-03 11:17:17
 */
public class AlipayOverseasTravelFliggyStoreModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5164521413223978474L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 回调处理是否成功，true标示处理成功，false标示处理失败
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
