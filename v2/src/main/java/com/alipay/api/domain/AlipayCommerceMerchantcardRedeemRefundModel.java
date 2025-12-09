package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销部分退费
 *
 * @author auto create
 * @since 1.0, 2025-11-20 15:52:41
 */
public class AlipayCommerceMerchantcardRedeemRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6455842523565442362L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 核销订单号
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 退款流水号标识一次退款请求，需要保证在订单号下唯一。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款流水号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款流水号多次请求只会退一次。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退卡金额（单位：分）
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因说明。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
