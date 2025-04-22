package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.offline.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayOpenEchoOfflineSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6187367433541655561L;

	/** 
	 * 10000
	 */
	@ApiField("word")
	private String word;

	public void setWord(String word) {
		this.word = word;
	}
	public String getWord( ) {
		return this.word;
	}

}
