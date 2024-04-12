package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.orderwordnum.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:21:21
 */
public class AlipayOpenSearchOrderwordnumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3476716991731692723L;

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
