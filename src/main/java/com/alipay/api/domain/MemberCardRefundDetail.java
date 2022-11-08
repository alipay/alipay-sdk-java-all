package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡退款明细
 *
 * @author auto create
 * @since 1.0, 2022-04-21 16:22:26
 */
public class MemberCardRefundDetail extends AlipayObject {

	private static final long serialVersionUID = 8142355896415572596L;

	/**
	 * 充值余额
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 充值订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 充值本金余额
	 */
	@ApiField("principal_balance")
	private String principalBalance;

	/**
	 * 记录时间
	 */
	@ApiField("record_time")
	private Date recordTime;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款权益金金额
	 */
	@ApiField("refund_benefit_amount")
	private String refundBenefitAmount;

	/**
	 * 扣减权益金已优惠金额
	 */
	@ApiField("subtract_benefit_amount")
	private String subtractBenefitAmount;

	/**
	 * 扣减已优惠金额
	 */
	@ApiField("subtract_discount_amount")
	private String subtractDiscountAmount;

	/**
	 * 扣减券已优惠金额
	 */
	@ApiField("subtract_voucher_amount")
	private String subtractVoucherAmount;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrincipalBalance() {
		return this.principalBalance;
	}
	public void setPrincipalBalance(String principalBalance) {
		this.principalBalance = principalBalance;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBenefitAmount() {
		return this.refundBenefitAmount;
	}
	public void setRefundBenefitAmount(String refundBenefitAmount) {
		this.refundBenefitAmount = refundBenefitAmount;
	}

	public String getSubtractBenefitAmount() {
		return this.subtractBenefitAmount;
	}
	public void setSubtractBenefitAmount(String subtractBenefitAmount) {
		this.subtractBenefitAmount = subtractBenefitAmount;
	}

	public String getSubtractDiscountAmount() {
		return this.subtractDiscountAmount;
	}
	public void setSubtractDiscountAmount(String subtractDiscountAmount) {
		this.subtractDiscountAmount = subtractDiscountAmount;
	}

	public String getSubtractVoucherAmount() {
		return this.subtractVoucherAmount;
	}
	public void setSubtractVoucherAmount(String subtractVoucherAmount) {
		this.subtractVoucherAmount = subtractVoucherAmount;
	}

}
