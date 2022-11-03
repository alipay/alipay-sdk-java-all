package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.credit.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-23 10:20:20
 */
public class ZhimaMerchantOrderCreditPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2522499223526273657L;

	/** 
	 * 支付宝生成的资金流水号，用于商户与支付宝进行对账，无支付行为时为空
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 此字段来源于商户创建订单时传入的值，帮助商户定位订单来源
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 支付失败原因描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户传入的资金交易号，无支付行为时为空
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/** 
	 * 本次处理支付金额，单位为元，精确到小数点后两位，无支付行为时为空
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付结果状态，包括：支付成功(PAY_SUCCESS)，支付失败(PAY_FAILED)，支付处理中(PAY_INPROGRESS)，无支付行为时为空
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 支付处理时间，无支付行为时为空
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 芝麻订单号，最长32位
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}
	public String getOutTransNo( ) {
		return this.outTransNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}
	public String getZmOrderNo( ) {
		return this.zmOrderNo;
	}

}
