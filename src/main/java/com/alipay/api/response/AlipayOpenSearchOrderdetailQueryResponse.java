package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchOrderDetailData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.orderdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-10 17:11:34
 */
public class AlipayOpenSearchOrderdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5244225781775928647L;

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
