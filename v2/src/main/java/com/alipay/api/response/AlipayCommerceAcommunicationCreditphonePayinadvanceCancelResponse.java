package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.creditphone.payinadvance.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:07
 */
public class AlipayCommerceAcommunicationCreditphonePayinadvanceCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6392569296381954655L;

	/** 
	 * 提前结清支付宝订单号
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
	 * 提前结清金额，单位元
	 */
	@ApiField("pay_in_advance_amount")
	private String payInAdvanceAmount;

	/** 
	 * 提前结清状态
	 */
	@ApiField("pay_in_advance_status")
	private String payInAdvanceStatus;

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

	public void setPayInAdvanceAmount(String payInAdvanceAmount) {
		this.payInAdvanceAmount = payInAdvanceAmount;
	}
	public String getPayInAdvanceAmount( ) {
		return this.payInAdvanceAmount;
	}

	public void setPayInAdvanceStatus(String payInAdvanceStatus) {
		this.payInAdvanceStatus = payInAdvanceStatus;
	}
	public String getPayInAdvanceStatus( ) {
		return this.payInAdvanceStatus;
	}

}
