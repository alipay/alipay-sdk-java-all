package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询退款单信息
 *
 * @author auto create
 * @since 1.0, 2024-12-25 14:01:58
 */
public class PerformRefundQueryRecord extends AlipayObject {

	private static final long serialVersionUID = 3839319825494111342L;

	/**
	 * 退款金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 退款完成时间
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/**
	 * 支付单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 实退金额,如果支付用了优惠券，实际退款金额和退款金额会不一样
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 单据退款原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 退收费金额
	 */
	@ApiField("refund_charge_fee")
	private String refundChargeFee;

	/**
	 * 退款单失败状态明细
	 */
	@ApiField("refund_error_info")
	private String refundErrorInfo;

	/**
	 * 退款请求号
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * I 退款受理
P 退款中
S 退款成功
F 退款失败
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Date getGmtRefundPay() {
		return this.gmtRefundPay;
	}
	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRefundChargeFee() {
		return this.refundChargeFee;
	}
	public void setRefundChargeFee(String refundChargeFee) {
		this.refundChargeFee = refundChargeFee;
	}

	public String getRefundErrorInfo() {
		return this.refundErrorInfo;
	}
	public void setRefundErrorInfo(String refundErrorInfo) {
		this.refundErrorInfo = refundErrorInfo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
