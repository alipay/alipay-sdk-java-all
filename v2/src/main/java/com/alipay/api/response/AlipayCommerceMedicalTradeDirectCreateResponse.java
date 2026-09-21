package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.direct.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:23
 */
public class AlipayCommerceMedicalTradeDirectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3786288355591125395L;

	/** 
	 * 支付宝交易hao
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 创单成功后返回的收银台链接
	 */
	@ApiField("pay_url")
	private String payUrl;

	/** 
	 * 请求入参中传入的
	 */
	@ApiField("subject")
	private String subject;

	/** 
	 * 逸康交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
