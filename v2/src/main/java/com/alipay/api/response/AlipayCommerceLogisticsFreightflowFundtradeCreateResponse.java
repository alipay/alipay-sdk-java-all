package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.fundtrade.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:32
 */
public class AlipayCommerceLogisticsFreightflowFundtradeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3358795441346881424L;

	/** 
	 * 业务请求没有失败码返回时必填,同入参中的biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 订单支付URL,平台可据此生成二维码(Base64格式，使用前先解码)
	 */
	@ApiField("order_pay_url")
	private String orderPayUrl;

	/** 
	 * 业务请求没有失败码返回时必填,状态为UNKNOWN不代表交易失败，需要通过回查确认最终的状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 当status=SUCCESS时必选
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setOrderPayUrl(String orderPayUrl) {
		this.orderPayUrl = orderPayUrl;
	}
	public String getOrderPayUrl( ) {
		return this.orderPayUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
