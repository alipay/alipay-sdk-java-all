package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.periodorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-11 15:27:01
 */
public class AlipayCommerceAcommunicationCreditphonePeriodorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7282213825885654658L;

	/** 
	 * 当期支付宝订单号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/** 
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/** 
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 当期外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付单总金额，单位元
	 */
	@ApiField("pay_order_amount")
	private String payOrderAmount;

	/** 
	 * 支付单状态
	 */
	@ApiField("pay_order_status")
	private String payOrderStatus;

	/** 
	 * 支付单支付宝交易号
	 */
	@ApiField("pay_order_trade_no")
	private String payOrderTradeNo;

	/** 
	 * 支付单用户实际支付金额，单位元
	 */
	@ApiField("pay_order_user_actual_amount")
	private String payOrderUserActualAmount;

	/** 
	 * 当期金额，单位元
	 */
	@ApiField("period_amount")
	private String periodAmount;

	/** 
	 * 当期处理状态
	 */
	@ApiField("period_status")
	private String periodStatus;

	/** 
	 * 当期期数
	 */
	@ApiField("step_number")
	private Long stepNumber;

	/** 
	 * 用户本期状态
	 */
	@ApiField("user_period_status")
	private String userPeriodStatus;

	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}
	public String getAlipayBizNo( ) {
		return this.alipayBizNo;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getAlipayOpenId( ) {
		return this.alipayOpenId;
	}

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPayOrderAmount(String payOrderAmount) {
		this.payOrderAmount = payOrderAmount;
	}
	public String getPayOrderAmount( ) {
		return this.payOrderAmount;
	}

	public void setPayOrderStatus(String payOrderStatus) {
		this.payOrderStatus = payOrderStatus;
	}
	public String getPayOrderStatus( ) {
		return this.payOrderStatus;
	}

	public void setPayOrderTradeNo(String payOrderTradeNo) {
		this.payOrderTradeNo = payOrderTradeNo;
	}
	public String getPayOrderTradeNo( ) {
		return this.payOrderTradeNo;
	}

	public void setPayOrderUserActualAmount(String payOrderUserActualAmount) {
		this.payOrderUserActualAmount = payOrderUserActualAmount;
	}
	public String getPayOrderUserActualAmount( ) {
		return this.payOrderUserActualAmount;
	}

	public void setPeriodAmount(String periodAmount) {
		this.periodAmount = periodAmount;
	}
	public String getPeriodAmount( ) {
		return this.periodAmount;
	}

	public void setPeriodStatus(String periodStatus) {
		this.periodStatus = periodStatus;
	}
	public String getPeriodStatus( ) {
		return this.periodStatus;
	}

	public void setStepNumber(Long stepNumber) {
		this.stepNumber = stepNumber;
	}
	public Long getStepNumber( ) {
		return this.stepNumber;
	}

	public void setUserPeriodStatus(String userPeriodStatus) {
		this.userPeriodStatus = userPeriodStatus;
	}
	public String getUserPeriodStatus( ) {
		return this.userPeriodStatus;
	}

}
