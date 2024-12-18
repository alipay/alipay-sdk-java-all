package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 20:56:39
 */
public class ZhimaCreditPeIndustryTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3355834575839477743L;

	/** 
	 * 资金流水号，用于商户与支付宝进行对账,资金处理成功时才有值
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 交易外部订单号,资金处理成功时才有值,供商户对账使用
	 */
	@ApiField("alipay_out_trade_no")
	private String alipayOutTradeNo;

	/** 
	 * 金额,单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 资金状态,支付成功:PAY_SUCCESS, 支付失败:PAY_FAILED, 支付中:PAY_INPROGRESS
	 */
	@ApiField("fund_status")
	private String fundStatus;

	/** 
	 * 金额类型,扣款: pay 退款: refund
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 传入的扣款或退款资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/** 
	 * 资金处理时间,格式"yyyy-MM-dd HH:mm:ss",无支付行为时为空
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}
	public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
	}

	public void setAlipayOutTradeNo(String alipayOutTradeNo) {
		this.alipayOutTradeNo = alipayOutTradeNo;
	}
	public String getAlipayOutTradeNo( ) {
		return this.alipayOutTradeNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setFundStatus(String fundStatus) {
		this.fundStatus = fundStatus;
	}
	public String getFundStatus( ) {
		return this.fundStatus;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundType( ) {
		return this.fundType;
	}

	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}
	public String getOutFundNo( ) {
		return this.outFundNo;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
