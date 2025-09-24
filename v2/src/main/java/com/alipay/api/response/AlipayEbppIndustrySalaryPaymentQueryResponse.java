package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.payment.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:28
 */
public class AlipayEbppIndustrySalaryPaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7346519335719189637L;

	/** 
	 * 代发商户商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 银行流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 响应加签xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

	/** 
	 * 交易状态
	 */
	@ApiField("status")
	private String status;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
