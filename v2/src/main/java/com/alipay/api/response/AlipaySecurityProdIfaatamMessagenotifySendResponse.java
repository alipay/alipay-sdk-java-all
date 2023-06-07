package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ifaatam.messagenotify.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:21:17
 */
public class AlipaySecurityProdIfaatamMessagenotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434693233878263933L;

	/** 
	 * 接口调用返回状态码
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 接口返回状态码描述
	 */
	@ApiField("return_msg")
	private String returnMsg;

	/** 
	 * 消息通知是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}
	public String getReturnMsg( ) {
		return this.returnMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
