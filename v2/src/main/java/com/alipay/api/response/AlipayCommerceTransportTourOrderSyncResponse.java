package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TourOrderSyncResponse;
import com.alipay.api.domain.TourOrderSyncFailureDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.tour.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-05 11:02:43
 */
public class AlipayCommerceTransportTourOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5778322824212672861L;

	/** 
	 * null
	 */
	@ApiListField("success_order_list")
	@ApiField("tour_order_sync_response")
	private List<TourOrderSyncResponse> successOrderList;

	/** 
	 * null
	 */
	@ApiListField("sync_failure_detail_list")
	@ApiField("tour_order_sync_failure_detail")
	private List<TourOrderSyncFailureDetail> syncFailureDetailList;

	/** 
	 * 失败的订单凭证号。
结构：
outBizNum|outVoucherId
	 */
	@ApiField("un_sync_order_no_list")
	private String unSyncOrderNoList;

	public void setSuccessOrderList(List<TourOrderSyncResponse> successOrderList) {
		this.successOrderList = successOrderList;
	}
	public List<TourOrderSyncResponse> getSuccessOrderList( ) {
		return this.successOrderList;
	}

	public void setSyncFailureDetailList(List<TourOrderSyncFailureDetail> syncFailureDetailList) {
		this.syncFailureDetailList = syncFailureDetailList;
	}
	public List<TourOrderSyncFailureDetail> getSyncFailureDetailList( ) {
		return this.syncFailureDetailList;
	}

	public void setUnSyncOrderNoList(String unSyncOrderNoList) {
		this.unSyncOrderNoList = unSyncOrderNoList;
	}
	public String getUnSyncOrderNoList( ) {
		return this.unSyncOrderNoList;
	}

}
