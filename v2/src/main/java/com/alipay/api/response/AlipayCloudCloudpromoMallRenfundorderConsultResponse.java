package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpcRefundReason;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.renfundorder.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 16:52:26
 */
public class AlipayCloudCloudpromoMallRenfundorderConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3369356772891236737L;

	/** 
	 * 支持的订单退货方式
	 */
	@ApiField("biz_claim_type")
	private String bizClaimType;

	/** 
	 * 本单最大可退款金额(单位：分)
	 */
	@ApiField("max_refund_fee")
	private String maxRefundFee;

	/** 
	 * 本单最小可退款金额(单位：分)
	 */
	@ApiField("min_refund_fee")
	private Long minRefundFee;

	/** 
	 * 子分销订单号
	 */
	@ApiField("order_line_id")
	private String orderLineId;

	/** 
	 * 逆向理由集合
	 */
	@ApiField("refund_reason_list")
	private MpcRefundReason refundReasonList;

	public void setBizClaimType(String bizClaimType) {
		this.bizClaimType = bizClaimType;
	}
	public String getBizClaimType( ) {
		return this.bizClaimType;
	}

	public void setMaxRefundFee(String maxRefundFee) {
		this.maxRefundFee = maxRefundFee;
	}
	public String getMaxRefundFee( ) {
		return this.maxRefundFee;
	}

	public void setMinRefundFee(Long minRefundFee) {
		this.minRefundFee = minRefundFee;
	}
	public Long getMinRefundFee( ) {
		return this.minRefundFee;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public String getOrderLineId( ) {
		return this.orderLineId;
	}

	public void setRefundReasonList(MpcRefundReason refundReasonList) {
		this.refundReasonList = refundReasonList;
	}
	public MpcRefundReason getRefundReasonList( ) {
		return this.refundReasonList;
	}

}
