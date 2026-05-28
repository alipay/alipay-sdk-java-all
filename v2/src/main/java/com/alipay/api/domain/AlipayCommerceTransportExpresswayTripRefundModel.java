package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付行程代扣退款
 *
 * @author auto create
 * @since 1.0, 2026-05-18 14:41:15
 */
public class AlipayCommerceTransportExpresswayTripRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6378923341585357818L;

	/**
	 * 支付宝侧车牌付代扣协议号，该协议号是经过车牌付业务域包装过的，只有该业务域能解析。
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 路网侧扣款行程单号： 1、需要与真实的扣款行程对应 2、路网侧全国车牌付场景下唯一
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/**
	 * 本次需要退款的金额： 1、单位为元； 2、该金额不能大于行程扣款的金额； 3、支持两位小数；
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
