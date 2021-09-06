package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-30 16:26:29
 */
public class AlipayTradeRepaybillOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7359275285939594254L;

	/** 
	 * 支付宝还款账单编号，和请求入参保持一致
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 支付宝系统资金处理成功时间，格式为"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("gmt_refund_pay")
	private String gmtRefundPay;

	/** 
	 * 本次退款请求的外部请求号，和请求入参保持一致
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setGmtRefundPay(String gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public String getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
