package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardcontent.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-18 20:51:40
 */
public class AlipaySocialBaseContentlibStandardcontentSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2876949588133373116L;

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
