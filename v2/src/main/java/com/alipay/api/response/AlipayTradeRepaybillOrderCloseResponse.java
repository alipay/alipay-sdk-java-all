package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:58:59
 */
public class AlipayTradeRepaybillOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8823798923837634719L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 这笔还款资金单在关闭时已经扣款的金额，单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/** 
	 * 还款的资金单号，后续用该单号去调用支付宝收银台sdk进行支付
	 */
	@ApiField("repay_fund_order_no")
	private String repayFundOrderNo;

	/** 
	 * 订单还款状态 ("INIT", "初始"),("PROCESSING", "处理中")("SUCCESS", "成功"),("CLOSE", "关闭");
	 */
	@ApiField("repay_order_status")
	private String repayOrderStatus;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPaidAmount( ) {
		return this.paidAmount;
	}

	public void setRepayFundOrderNo(String repayFundOrderNo) {
		this.repayFundOrderNo = repayFundOrderNo;
	}
	public String getRepayFundOrderNo( ) {
		return this.repayFundOrderNo;
	}

	public void setRepayOrderStatus(String repayOrderStatus) {
		this.repayOrderStatus = repayOrderStatus;
	}
	public String getRepayOrderStatus( ) {
		return this.repayOrderStatus;
	}

}
