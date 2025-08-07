package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.salary.payment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 11:27:28
 */
public class AlipayEbppIndustrySalaryPaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8552126117881164429L;

	/** 
	 * 代发商户的商户号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 网商支付订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * base64加密的响应加签xml
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

	public void setSignXml(String signXml) {
		this.signXml = signXml;
	}
	public String getSignXml( ) {
		return this.signXml;
	}

}
