package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchOrderDetailData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.orderdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-23 16:38:00
 */
public class AlipayOpenSearchOrderdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2816189748299136178L;

	/** 
	 * 申请单详情
	 */
	@ApiField("data")
	private SearchOrderDetailData data;

	public void setData(SearchOrderDetailData data) {
		this.data = data;
	}
	public SearchOrderDetailData getData( ) {
		return this.data;
	}

}
