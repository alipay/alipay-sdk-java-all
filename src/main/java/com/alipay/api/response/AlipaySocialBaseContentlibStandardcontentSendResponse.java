package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:17:23
 */
public class AlipaySocialBaseContentlibStandardcontentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1743979252591236338L;

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
