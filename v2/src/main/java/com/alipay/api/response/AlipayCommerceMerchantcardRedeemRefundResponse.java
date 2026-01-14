package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.redeem.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 15:52:41
 */
public class AlipayCommerceMerchantcardRedeemRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6115999121216778856L;

	/** 
	 * 实际退款金额（单位：分）
	 */
	@ApiField("actual_refund_amount")
	private String actualRefundAmount;

	/** 
	 * 退核销订单号
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/** 
	 * 原核销订单号
	 */
	@ApiField("original_deduction_order_id")
	private String originalDeductionOrderId;

	/** 
	 * 退款结果说明
	 */
	@ApiField("refund_remark")
	private String refundRemark;

	/** 
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 退款完成时间
	 */
	@ApiField("refund_time")
	private String refundTime;

	/** 
	 * 本次退款核销的交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setActualRefundAmount(String actualRefundAmount) {
		this.actualRefundAmount = actualRefundAmount;
	}
	public String getActualRefundAmount( ) {
		return this.actualRefundAmount;
	}

	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}
	public String getDeductionOrderId( ) {
		return this.deductionOrderId;
	}

	public void setOriginalDeductionOrderId(String originalDeductionOrderId) {
		this.originalDeductionOrderId = originalDeductionOrderId;
	}
	public String getOriginalDeductionOrderId( ) {
		return this.originalDeductionOrderId;
	}

	public void setRefundRemark(String refundRemark) {
		this.refundRemark = refundRemark;
	}
	public String getRefundRemark( ) {
		return this.refundRemark;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
	public String getRefundTime( ) {
		return this.refundTime;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
