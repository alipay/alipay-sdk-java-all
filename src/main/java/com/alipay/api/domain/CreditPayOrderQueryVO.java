package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付单据查询视图结果
 *
 * @author auto create
 * @since 1.0, 2020-10-20 20:41:00
 */
public class CreditPayOrderQueryVO extends AlipayObject {

	private static final long serialVersionUID = 4578324832314851595L;

	/**
	 * 已入账金额
	 */
	@ApiField("acc_amt")
	private Long accAmt;

	/**
	 * 支付金额，单位分
	 */
	@ApiField("pay_amt")
	private Long payAmt;

	/**
	 * 支付收单订单号
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/**
	 * 入账后退款金额，单位分
	 */
	@ApiField("refund_af_acc_amt")
	private Long refundAfAccAmt;

	/**
	 * 入账前退款金额，单位分
	 */
	@ApiField("refund_bef_acc_amt")
	private Long refundBefAccAmt;

	/**
	 * 用户已还款金额（非退款导致，如主动还款和批扣），单位分
	 */
	@ApiField("repay_amt")
	private Long repayAmt;

	public Long getAccAmt() {
		return this.accAmt;
	}
	public void setAccAmt(Long accAmt) {
		this.accAmt = accAmt;
	}

	public Long getPayAmt() {
		return this.payAmt;
	}
	public void setPayAmt(Long payAmt) {
		this.payAmt = payAmt;
	}

	public String getPayOrderNo() {
		return this.payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public Long getRefundAfAccAmt() {
		return this.refundAfAccAmt;
	}
	public void setRefundAfAccAmt(Long refundAfAccAmt) {
		this.refundAfAccAmt = refundAfAccAmt;
	}

	public Long getRefundBefAccAmt() {
		return this.refundBefAccAmt;
	}
	public void setRefundBefAccAmt(Long refundBefAccAmt) {
		this.refundBefAccAmt = refundBefAccAmt;
	}

	public Long getRepayAmt() {
		return this.repayAmt;
	}
	public void setRepayAmt(Long repayAmt) {
		this.repayAmt = repayAmt;
	}

}
