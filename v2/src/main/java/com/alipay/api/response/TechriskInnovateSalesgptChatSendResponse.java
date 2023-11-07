package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.salesgpt.chat.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-25 17:46:45
 */
public class TechriskInnovateSalesgptChatSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8895882671745186135L;

	/** 
	 * 对话结果，需要接入方优化使用
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
