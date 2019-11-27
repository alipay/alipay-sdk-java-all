package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.offline.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-27 11:42:55
 */
public class AlipayOpenEchoOfflineSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7321676172343465885L;

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
