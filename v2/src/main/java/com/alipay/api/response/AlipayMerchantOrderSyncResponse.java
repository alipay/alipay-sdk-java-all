package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderDataDistributeInfo;
import com.alipay.api.domain.OrderDataSyncSuggestion;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-29 10:22:12
 */
public class AlipayMerchantOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1561682529481366519L;

	/** 
	 * "分发结果 若未分发到场景侧，则会返回具体的未分发原因"
	 */
	@ApiListField("distribute_result")
	@ApiField("order_data_distribute_info")
	private List<OrderDataDistributeInfo> distributeResult;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 同步订单记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/** 
	 * 订单同步优化建议，供开发者参考
	 */
	@ApiListField("sync_suggestions")
	@ApiField("order_data_sync_suggestion")
	private List<OrderDataSyncSuggestion> syncSuggestions;

	public void setDistributeResult(List<OrderDataDistributeInfo> distributeResult) {
		this.distributeResult = distributeResult;
	}
	public List<OrderDataDistributeInfo> getDistributeResult( ) {
		return this.distributeResult;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

	public void setSyncSuggestions(List<OrderDataSyncSuggestion> syncSuggestions) {
		this.syncSuggestions = syncSuggestions;
	}
	public List<OrderDataSyncSuggestion> getSyncSuggestions( ) {
		return this.syncSuggestions;
	}

}
