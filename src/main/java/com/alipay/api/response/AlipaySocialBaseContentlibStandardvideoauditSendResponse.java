package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardvideoaudit.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:26:49
 */
public class AlipaySocialBaseContentlibStandardvideoauditSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5334884691395931778L;

	/** 
	 * result_msg为请求openAPI接口后返回的结果message
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
