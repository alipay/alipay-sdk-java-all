package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringOrderPayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1271564434521347853L;

	/** 
	 * 外部支付订单号,唯一标识本次支付的requestID
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
