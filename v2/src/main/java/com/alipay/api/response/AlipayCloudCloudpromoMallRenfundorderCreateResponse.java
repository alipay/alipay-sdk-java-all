package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.renfundorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-04 20:17:03
 */
public class AlipayCloudCloudpromoMallRenfundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3266213224498458791L;

	/** 
	 * 纠纷id
	 */
	@ApiField("dispute_id")
	private String disputeId;

	/** 
	 * 逆向的状态
	 */
	@ApiField("dispute_status")
	private String disputeStatus;

	/** 
	 * 子分销订单号
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	public void setDisputeId(String disputeId) {
		this.disputeId = disputeId;
	}
	public String getDisputeId( ) {
		return this.disputeId;
	}

	public void setDisputeStatus(String disputeStatus) {
		this.disputeStatus = disputeStatus;
	}
	public String getDisputeStatus( ) {
		return this.disputeStatus;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getOrderLineId( ) {
		return this.orderLineId;
	}

}
