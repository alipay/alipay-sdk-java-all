package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 19:46:42
 */
public class AlipayEcoMycarParkingOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4368295189527952433L;

	/** 
	 * 垫资金额，不返回表示没有走垫资非空表示垫资支付的金额
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/** 
	 * 如果垫资金额不为空，则返回支付宝停车平台用户主动还款链接。服务商引导用户点击链接时，会跳转到用户在支付宝停车平台的待还款页面。
服务商可保存该链接作为用户还款入口地址。
	 */
	@ApiField("alipay_repayment_url")
	private String alipayRepaymentUrl;

	/** 
	 * 本次交易使用的支付渠道信息。详见（支付渠道信息）
	 */
	@ApiField("fund_bill_list")
	private String fundBillList;

	/** 
	 * 该笔交易的买家付款时间。
格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 应用用户ID,支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易金额
保留小数点后两位
	 */
	@ApiField("total_fee")
	private String totalFee;

	/** 
	 * 该交易在支付宝系统中的交易流水号。系统唯一，最短16位，最长64位
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 买家支付宝用户ID，用于标识订单扣款用户及订单回传使用
	 */
	@ApiField("user_id")
	private String userId;

	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getAdvanceAmount( ) {
		return this.advanceAmount;
	}

	public void setAlipayRepaymentUrl(String alipayRepaymentUrl) {
		this.alipayRepaymentUrl = alipayRepaymentUrl;
	}
	public String getAlipayRepaymentUrl( ) {
		return this.alipayRepaymentUrl;
	}

	public void setFundBillList(String fundBillList) {
		this.fundBillList = fundBillList;
	}
	public String getFundBillList( ) {
		return this.fundBillList;
	}

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
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

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTotalFee( ) {
		return this.totalFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
