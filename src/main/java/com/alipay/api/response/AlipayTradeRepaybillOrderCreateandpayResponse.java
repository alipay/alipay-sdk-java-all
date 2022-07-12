package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.order.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-09 11:27:13
 */
public class AlipayTradeRepaybillOrderCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348226829111859136L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 还款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/** 
	 * 还款的资金单号，后续用该单号去调用支付宝收银台sdk进行支付
	 */
	@ApiField("repay_fund_order_no")
	private String repayFundOrderNo;

	/** 
	 * 订单还款状态，INIT：初始状态；PARTIAL_SUCCESS：部分还款成功；SUCCESS：全部还款成功；CLOSE：订单已经关闭
	 */
	@ApiField("repay_status")
	private String repayStatus;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}
	public String getRepayAmount( ) {
		return this.repayAmount;
	}

	public void setRepayFundOrderNo(String repayFundOrderNo) {
		this.repayFundOrderNo = repayFundOrderNo;
	}
	public String getRepayFundOrderNo( ) {
		return this.repayFundOrderNo;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}
	public String getRepayStatus( ) {
		return this.repayStatus;
	}

}
