package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchBrandBoxInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brandbox.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:22:22
 */
public class AlipayOpenSearchBrandboxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3158734931411885388L;

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
