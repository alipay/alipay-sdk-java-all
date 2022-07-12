package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.orderwordnum.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:47
 */
public class AlipayOpenSearchOrderwordnumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7327944119954383953L;

	/** 
	 * 可配置关键词数量
	 */
	@ApiField("keyword_num")
	private String keywordNum;

	public void setKeywordNum(String keywordNum) {
		this.keywordNum = keywordNum;
	}
	public String getKeywordNum( ) {
		return this.keywordNum;
	}

}
