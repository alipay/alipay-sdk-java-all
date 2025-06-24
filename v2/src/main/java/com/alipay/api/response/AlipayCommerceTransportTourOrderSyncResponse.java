package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TourOrderSyncResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-16 16:37:28
 */
public class AlipayCommerceTransportTourOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6742673643479566696L;

	/** 
	 * null
	 */
	@ApiListField("success_order_list")
	@ApiField("tour_order_sync_response")
	private List<TourOrderSyncResponse> successOrderList;

	/** 
	 * 失败的订单id
	 */
	@ApiField("un_sync_order_no_list")
	private String unSyncOrderNoList;

	public void setSuccessOrderList(List<TourOrderSyncResponse> successOrderList) {
		this.successOrderList = successOrderList;
	}
	public List<TourOrderSyncResponse> getSuccessOrderList( ) {
		return this.successOrderList;
	}

	public void setUnSyncOrderNoList(String unSyncOrderNoList) {
		this.unSyncOrderNoList = unSyncOrderNoList;
	}
	public String getUnSyncOrderNoList( ) {
		return this.unSyncOrderNoList;
	}

}
