package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.perform.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-07 11:16:34
 */
public class AlipayEbppIndustryPerformOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1165189834465878416L;

	/** 
	 * 账单金额(订单原价，单位元)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 业务受理平台业务28位订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 行业业务受理平台分配的机构编码
	 */
	@ApiField("inst_code")
	private String instCode;

	/** 
	 * 商户订单号。
订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 用户实际支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 行业业务受理平台分配的业务服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}
	public String getBillAmount( ) {
		return this.billAmount;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}
	public String getInstCode( ) {
		return this.instCode;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}
	public String getOutNo( ) {
		return this.outNo;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
