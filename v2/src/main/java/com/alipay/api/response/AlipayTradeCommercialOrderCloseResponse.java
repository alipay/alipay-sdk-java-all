package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.commercial.order.close response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-08 19:47:57
 */
public class AlipayTradeCommercialOrderCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4151511687213882919L;

	/** 
	 * 订单关闭时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_close")
	private String gmtClose;

	/** 
	 * 本次关闭的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setGmtClose(String gmtClose) {
		this.gmtClose = gmtClose;
	}
	public String getGmtClose( ) {
		return this.gmtClose;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
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
