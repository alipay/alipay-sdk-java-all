package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.commercial.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-15 17:17:56
 */
public class AlipayTradeCommercialOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353825555893334197L;

	/** 
	 * 长链，适用于跳转拉起支付宝端；ui_mode= app_schema时返回
	 */
	@ApiField("alipay_jump_schema")
	private String alipayJumpSchema;

	/** 
	 * 短链，适用于生成二维码 ；ui_mode= app_schema时返回
	 */
	@ApiField("alipay_schema")
	private String alipaySchema;

	/** 
	 * 本次支付的收银台地址，可用于302跳转
	 */
	@ApiField("checkout_url")
	private String checkoutUrl;

	/** 
	 * 本次支付的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 本次支付的二维码链接，有效期2小时
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 本次订单的状态
	 */
	@ApiField("status")
	private String status;

	public void setAlipayJumpSchema(String alipayJumpSchema) {
		this.alipayJumpSchema = alipayJumpSchema;
	}
	public String getAlipayJumpSchema( ) {
		return this.alipayJumpSchema;
	}

	public void setAlipaySchema(String alipaySchema) {
		this.alipaySchema = alipaySchema;
	}
	public String getAlipaySchema( ) {
		return this.alipaySchema;
	}

	public void setCheckoutUrl(String checkoutUrl) {
		this.checkoutUrl = checkoutUrl;
	}
	public String getCheckoutUrl( ) {
		return this.checkoutUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
