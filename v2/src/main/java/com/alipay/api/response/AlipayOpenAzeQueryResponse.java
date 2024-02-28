package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.aze.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-28 15:48:20
 */
public class AlipayOpenAzeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6285852958193744394L;

	/** 
	 * 测试
	 */
	@ApiField("key_word")
	private String keyWord;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private String result;

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getKeyWord( ) {
		return this.keyWord;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
