package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.version.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-06 19:27:50
 */
public class AlipayOpenAgentVersionDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4869441354513415624L;

	/** 
	 * 该版本该渠道最新投放记录ID，查无记录时为空
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/** 
	 * 最新投放状态，查无记录时为空
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/** 
	 * 投放驳回原因，非驳回为空
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryId( ) {
		return this.deliveryId;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getDeliveryStatus( ) {
		return this.deliveryStatus;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
