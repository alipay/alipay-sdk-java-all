package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.cansearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:38
 */
public class AlipayOpenMiniInnerCansearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2481626746651822967L;

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
