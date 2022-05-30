package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringOrderPayCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4523513216384938773L;

	/** 
	 * 撤销操作:REFUND-退款,CLOSE-关闭
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 外部支付订单号,唯一标识本 次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/** 
	 * 口碑内部支付订单号,和外部支付订单号一一映射
	 */
	@ApiField("pay_no")
	private String payNo;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAction(String action) {
		this.action = action;
	}
	public String getAction( ) {
		return this.action;
	}

	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}
	public String getOutPayNo( ) {
		return this.outPayNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getPayNo( ) {
		return this.payNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
