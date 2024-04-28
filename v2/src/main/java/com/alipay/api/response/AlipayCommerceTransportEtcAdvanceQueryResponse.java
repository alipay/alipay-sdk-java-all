package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcTripAdvanceDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.advance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-06 16:21:58
 */
public class AlipayCommerceTransportEtcAdvanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2628899133258196752L;

	/** 
	 * 行程垫资未还列表
	 */
	@ApiListField("trip_advance_list")
	@ApiField("etc_trip_advance_detail")
	private List<EtcTripAdvanceDetail> tripAdvanceList;

	public void setTripAdvanceList(List<EtcTripAdvanceDetail> tripAdvanceList) {
		this.tripAdvanceList = tripAdvanceList;
	}
	public List<EtcTripAdvanceDetail> getTripAdvanceList( ) {
		return this.tripAdvanceList;
	}

}
