package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.image.route.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayIserviceCognitiveImageRouteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4161891383381711254L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误详细描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 业务识别内容
	 */
	@ApiField("res")
	private String res;

	/** 
	 * true: 成功
false:失败
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

	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
