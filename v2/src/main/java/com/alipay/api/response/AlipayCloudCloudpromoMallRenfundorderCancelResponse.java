package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.renfundorder.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:46
 */
public class AlipayCloudCloudpromoMallRenfundorderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1643548996955876936L;

	/** 
	 * 纠纷id
	 */
	@ApiField("dispute_id")
	private String disputeId;

	/** 
	 * 1-退货待处理 2-待买家退货 3-待商家收货 4-退款关闭 5-退款成功 6-已拒绝退款 17-取消退款中
	 */
	@ApiField("dispute_status")
	private Long disputeStatus;

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

	public void setDisputeStatus(Long disputeStatus) {
		this.disputeStatus = disputeStatus;
	}
	public Long getDisputeStatus( ) {
		return this.disputeStatus;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getOrderLineId( ) {
		return this.orderLineId;
	}

}
