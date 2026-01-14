package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.renfundorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:41
 */
public class AlipayCloudCloudpromoMallRenfundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6277711681817182655L;

	/** 
	 * 订单退货方式
	 */
	@ApiField("biz_claim_type")
	private String bizClaimType;

	/** 
	 * 逆向创建时间
	 */
	@ApiField("dispute_create_time")
	private String disputeCreateTime;

	/** 
	 * 逆向结束时间
	 */
	@ApiField("dispute_end_time")
	private String disputeEndTime;

	/** 
	 * 逆向的状态
	 */
	@ApiField("dispute_status")
	private String disputeStatus;

	/** 
	 * 主单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 子单id
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	/** 
	 * 退款金额(单位：分)
	 */
	@ApiField("refund_fee")
	private Long refundFee;

	/** 
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 商家退货地址
	 */
	@ApiField("refunder_address")
	private String refunderAddress;

	/** 
	 * refunderName
	 */
	@ApiField("refunder_name")
	private String refunderName;

	/** 
	 * 退货联系方式
	 */
	@ApiField("refunder_tel")
	private String refunderTel;

	/** 
	 * 商家拒绝原因
	 */
	@ApiField("seller_refuse_reason")
	private String sellerRefuseReason;

	public void setBizClaimType(String bizClaimType) {
		this.bizClaimType = bizClaimType;
	}
	public String getBizClaimType( ) {
		return this.bizClaimType;
	}

	public void setDisputeCreateTime(String disputeCreateTime) {
		this.disputeCreateTime = disputeCreateTime;
	}
	public String getDisputeCreateTime( ) {
		return this.disputeCreateTime;
	}

	public void setDisputeEndTime(String disputeEndTime) {
		this.disputeEndTime = disputeEndTime;
	}
	public String getDisputeEndTime( ) {
		return this.disputeEndTime;
	}

	public void setDisputeStatus(String disputeStatus) {
		this.disputeStatus = disputeStatus;
	}
	public String getDisputeStatus( ) {
		return this.disputeStatus;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getOrderLineId( ) {
		return this.orderLineId;
	}

	public void setRefundFee(Long refundFee) {
		this.refundFee = refundFee;
	}
	public Long getRefundFee( ) {
		return this.refundFee;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setRefunderAddress(String refunderAddress) {
		this.refunderAddress = refunderAddress;
	}
	public String getRefunderAddress( ) {
		return this.refunderAddress;
	}

	public void setRefunderName(String refunderName) {
		this.refunderName = refunderName;
	}
	public String getRefunderName( ) {
		return this.refunderName;
	}

	public void setRefunderTel(String refunderTel) {
		this.refunderTel = refunderTel;
	}
	public String getRefunderTel( ) {
		return this.refunderTel;
	}

	public void setSellerRefuseReason(String sellerRefuseReason) {
		this.sellerRefuseReason = sellerRefuseReason;
	}
	public String getSellerRefuseReason( ) {
		return this.sellerRefuseReason;
	}

}
