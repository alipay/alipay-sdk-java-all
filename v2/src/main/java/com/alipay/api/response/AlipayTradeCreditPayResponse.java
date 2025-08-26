package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.pay response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 17:02:34
 */
public class AlipayTradeCreditPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 8593746149974792161L;

	/** 
	 * 在未生成真实交易时，不返回，需要商户调用交易查询接口或接入支付通知，获取最终的用户信息
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 信用单id
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 交易付款时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部商户交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次使用信用资产下单的金额
	 */
	@ApiField("pre_auth_pay_amount")
	private String preAuthPayAmount;

	/** 
	 * 订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 在未生成真实交易时，不返回，需要商户调用交易查询接口或接入支付通知，获取最终的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPreAuthPayAmount(String preAuthPayAmount) {
		this.preAuthPayAmount = preAuthPayAmount;
	}
	public String getPreAuthPayAmount( ) {
		return this.preAuthPayAmount;
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
