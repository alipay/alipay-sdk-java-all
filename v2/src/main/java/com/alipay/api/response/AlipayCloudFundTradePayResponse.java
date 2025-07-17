package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.fund.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 16:16:23
 */
public class AlipayCloudFundTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 5217639479282426954L;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 是否可以转为app支付，仅当商户代扣失败场景才会返回该字段信息。
	 */
	@ApiField("can_turn_to_app_pay")
	private Boolean canTurnToAppPay;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId( ) {
		return this.buyerOpenId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setCanTurnToAppPay(Boolean canTurnToAppPay) {
		this.canTurnToAppPay = canTurnToAppPay;
	}
	public Boolean getCanTurnToAppPay( ) {
		return this.canTurnToAppPay;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
