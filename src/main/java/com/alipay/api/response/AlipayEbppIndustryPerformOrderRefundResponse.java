package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.perform.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-29 14:40:33
 */
public class AlipayEbppIndustryPerformOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1738258529513554572L;

	/** 
	 * 账单金额(订单原价，金额分)
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/** 
	 * 订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 机构code
	 */
	@ApiField("inst_code")
	private String instCode;

	/** 
	 * 外部唯一订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 实际支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

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

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
