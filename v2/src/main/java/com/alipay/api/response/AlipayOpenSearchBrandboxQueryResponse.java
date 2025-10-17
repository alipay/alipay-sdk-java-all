package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchBrandBoxInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brandbox.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:37:36
 */
public class AlipayOpenSearchBrandboxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7326815952328451566L;

	/** 
	 * 品牌box详情
	 */
	@ApiField("data")
	private SearchBrandBoxInfo data;

	public void setData(SearchBrandBoxInfo data) {
		this.data = data;
	}
	public SearchBrandBoxInfo getData( ) {
		return this.data;
	}

}
