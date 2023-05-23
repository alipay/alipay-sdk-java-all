package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.cansearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:05:31
 */
public class AlipayOpenMiniInnerCansearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3233785167891485176L;

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
