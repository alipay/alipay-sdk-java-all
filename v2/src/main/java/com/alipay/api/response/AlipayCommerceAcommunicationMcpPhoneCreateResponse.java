package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QWOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.mcp.phone.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class AlipayCommerceAcommunicationMcpPhoneCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7169117461875495634L;

	/** 
	 * 话费业务订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 订单详情条转链接
	 */
	@ApiField("order_jump_url")
	private String orderJumpUrl;

	/** 
	 * 千问订单信息
	 */
	@ApiField("plain_text")
	private QWOrderInfo plainText;

	/** 
	 * AI付产品返回的预支付号，千问可根据此ID拉起收银台
	 */
	@ApiField("pre_pay_id")
	private String prePayId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setOrderJumpUrl(String orderJumpUrl) {
		this.orderJumpUrl = orderJumpUrl;
	}
	public String getOrderJumpUrl( ) {
		return this.orderJumpUrl;
	}

	public void setPlainText(QWOrderInfo plainText) {
		this.plainText = plainText;
	}
	public QWOrderInfo getPlainText( ) {
		return this.plainText;
	}

	public void setPrePayId(String prePayId) {
		this.prePayId = prePayId;
	}
	public String getPrePayId( ) {
		return this.prePayId;
	}

}
