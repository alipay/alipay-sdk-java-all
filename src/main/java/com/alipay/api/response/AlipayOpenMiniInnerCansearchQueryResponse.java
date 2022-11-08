package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.cansearch.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-27 12:26:41
 */
public class AlipayOpenMiniInnerCansearchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6446192641337411649L;

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
