package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.salesgpt.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-25 17:46:45
 */
public class TechriskInnovateSalesgptChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3137951231518158786L;

	/** 
	 * 查询结果，需要接入方优化使用
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
