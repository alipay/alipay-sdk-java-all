package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活租车退款明细
 *
 * @author auto create
 * @since 1.0, 2025-09-15 15:50:15
 */
public class RentCarRefundItem extends AlipayObject {

	private static final long serialVersionUID = 4336342238233383541L;

	/**
	 * 用于对账，对应业务账单中的商家订单号字段
	 */
	@ApiField("bill_merchant_order_id")
	private String billMerchantOrderId;

	/**
	 * 用于对账，对应业务账单中的退款批次号字段
	 */
	@ApiField("bill_refund_batch_no")
	private String billRefundBatchNo;

	/**
	 * 当前退款请求在此支付流水中退款的金额，单位分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 当前退款请求在此支付流水中退款的结果
	 */
	@ApiField("refund_result")
	private String refundResult;

	/**
	 * 支付流水的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBillMerchantOrderId() {
		return this.billMerchantOrderId;
	}
	public void setBillMerchantOrderId(String billMerchantOrderId) {
		this.billMerchantOrderId = billMerchantOrderId;
	}

	public String getBillRefundBatchNo() {
		return this.billRefundBatchNo;
	}
	public void setBillRefundBatchNo(String billRefundBatchNo) {
		this.billRefundBatchNo = billRefundBatchNo;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundResult() {
		return this.refundResult;
	}
	public void setRefundResult(String refundResult) {
		this.refundResult = refundResult;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
