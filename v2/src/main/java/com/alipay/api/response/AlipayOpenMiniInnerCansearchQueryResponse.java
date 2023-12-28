package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.cansearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:43:42
 */
public class AlipayOpenMiniInnerCansearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5513131257651918992L;

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
