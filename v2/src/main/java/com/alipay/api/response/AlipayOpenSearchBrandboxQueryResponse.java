package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchBrandBoxInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brandbox.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:15:10
 */
public class AlipayOpenSearchBrandboxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1153452456163641334L;

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
