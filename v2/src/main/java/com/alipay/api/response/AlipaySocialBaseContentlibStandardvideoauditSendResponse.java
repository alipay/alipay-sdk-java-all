package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardvideoaudit.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:03:37
 */
public class AlipaySocialBaseContentlibStandardvideoauditSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5358313378969384882L;

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
