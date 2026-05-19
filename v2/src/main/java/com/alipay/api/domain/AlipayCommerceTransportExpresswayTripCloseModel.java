package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付行程代扣关闭
 *
 * @author auto create
 * @since 1.0, 2026-05-18 14:41:03
 */
public class AlipayCommerceTransportExpresswayTripCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3746815767344694912L;

	/**
	 * 支付宝车牌付代扣协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 路网侧扣款行程单号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/**
	 * 行程支付撤销原因
	 */
	@ApiField("reverse_reason")
	private String reverseReason;

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

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}

	public String getReverseReason() {
		return this.reverseReason;
	}
	public void setReverseReason(String reverseReason) {
		this.reverseReason = reverseReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
