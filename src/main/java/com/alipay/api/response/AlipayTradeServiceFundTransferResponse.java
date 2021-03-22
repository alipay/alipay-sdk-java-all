package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.fund.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-07 19:55:41
 */
public class AlipayTradeServiceFundTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7384734993125883992L;

	/** 
	 * 成功转账金额，单位为元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝转账订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
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
