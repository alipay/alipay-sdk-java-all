package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文旅阵地行业凭证信息详情
 *
 * @author auto create
 * @since 1.0, 2024-07-09 15:26:10
 */
public class TourVoucherInfoQueryopenapiResult extends AlipayObject {

	private static final long serialVersionUID = 7113457742799165979L;

	/**
	 * 有效期结束时间
	 */
	@ApiField("effective_time_end")
	private Date effectiveTimeEnd;

	/**
	 * 凭证有效期开始时间
	 */
	@ApiField("effective_time_start")
	private Date effectiveTimeStart;

	/**
	 * 凭证实际核销时间
	 */
	@ApiField("exp_date")
	private Date expDate;

	/**
	 * 商品库商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款订单ID
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 凭证状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝凭证ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public Date getEffectiveTimeEnd() {
		return this.effectiveTimeEnd;
	}
	public void setEffectiveTimeEnd(Date effectiveTimeEnd) {
		this.effectiveTimeEnd = effectiveTimeEnd;
	}

	public Date getEffectiveTimeStart() {
		return this.effectiveTimeStart;
	}
	public void setEffectiveTimeStart(Date effectiveTimeStart) {
		this.effectiveTimeStart = effectiveTimeStart;
	}

	public Date getExpDate() {
		return this.expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundOrderId() {
		return this.refundOrderId;
	}
	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
