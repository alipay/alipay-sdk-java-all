package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.cansearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:58:52
 */
public class AlipayOpenMiniInnerCansearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3467341716218765916L;

	/** 
	 * 该小程序是否可搜索
	 */
	@ApiField("can_search")
	private Boolean canSearch;

	public void setCanSearch(Boolean canSearch) {
		this.canSearch = canSearch;
	}
	public Boolean getCanSearch( ) {
		return this.canSearch;
	}

}
