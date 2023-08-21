package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 19:29:13
 */
public class AlipaySocialBaseContentlibStandardcontentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219777357685427992L;

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
