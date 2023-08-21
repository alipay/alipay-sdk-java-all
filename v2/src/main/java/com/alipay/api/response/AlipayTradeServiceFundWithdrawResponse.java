package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.fund.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 21:52:39
 */
public class AlipayTradeServiceFundWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 4452977853755355611L;

	/** 
	 * 实际提现金额,单位:元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户端的唯一订单号，对于同一笔提现请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
