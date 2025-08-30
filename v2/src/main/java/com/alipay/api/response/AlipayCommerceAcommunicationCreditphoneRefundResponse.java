package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:06
 */
public class AlipayCommerceAcommunicationCreditphoneRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6825815495259898289L;

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
	 * 支付宝退款单号
	 */
	@ApiField("alipay_refund_no")
	private String alipayRefundNo;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

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

	public void setAlipayRefundNo(String alipayRefundNo) {
		this.alipayRefundNo = alipayRefundNo;
	}
	public String getAlipayRefundNo( ) {
		return this.alipayRefundNo;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

}
