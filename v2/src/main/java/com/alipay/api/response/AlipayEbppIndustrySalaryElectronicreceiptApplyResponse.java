package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.electronicreceipt.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:28
 */
public class AlipayEbppIndustrySalaryElectronicreceiptApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7115543267666436662L;

	/** 
	 * 网商商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 网商订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 请求参数中流水号保持一致
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 电子回单编号
	 */
	@ApiField("receipt_no")
	private String receiptNo;

	/** 
	 * 响应加签xml, base64编码
	 */
	@ApiField("sign_xml")
	private String signXml;

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

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptNo( ) {
		return this.receiptNo;
	}

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
