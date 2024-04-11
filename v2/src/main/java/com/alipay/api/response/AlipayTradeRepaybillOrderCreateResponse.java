package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:47:13
 */
public class AlipayTradeRepaybillOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5461898814845331736L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 收银单id，用于客户端唤起收银台SDK
	 */
	@ApiField("cashier_order_id")
	private String cashierOrderId;

	/** 
	 * 还款的资金单号，后续用该单号去调用支付宝收银台sdk进行支付
	 */
	@ApiField("repay_fund_order_no")
	private String repayFundOrderNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setCashierOrderId(String cashierOrderId) {
		this.cashierOrderId = cashierOrderId;
	}
	public String getCashierOrderId( ) {
		return this.cashierOrderId;
	}

	public void setRepayFundOrderNo(String repayFundOrderNo) {
		this.repayFundOrderNo = repayFundOrderNo;
	}
	public String getRepayFundOrderNo( ) {
		return this.repayFundOrderNo;
	}

}
