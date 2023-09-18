package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单还款支付单退款
 *
 * @author auto create
 * @since 1.0, 2020-09-30 16:26:28
 */
public class AlipayTradeRepaybillOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1321563774857126245L;

	/**
	 * 退款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝还款账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 退款的扩展信息，格式为json字符串
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 因为同一笔支付宝还款账单可以多次还款，对应多个还款订单。该字段对应本次需要退款的那笔还款单外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 本次退款请求的外部请求号，用于支付宝内部做幂等控制。同一笔bill_no下out_request_no不能相同，如果相同则代表是重复请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
