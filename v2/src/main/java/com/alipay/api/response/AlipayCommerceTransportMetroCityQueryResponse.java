package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryCityResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.metro.city.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:33
 */
public class AlipayCommerceTransportMetroCityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6826235886511436535L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("query_city_resp")
	private List<QueryCityResp> list;

	public void setList(List<QueryCityResp> list) {
		this.list = list;
	}
	public List<QueryCityResp> getList( ) {
		return this.list;
	}

}
