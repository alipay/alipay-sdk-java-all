package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付行程代扣查询状态
 *
 * @author auto create
 * @since 1.0, 2026-05-28 20:51:16
 */
public class AlipayCommerceTransportExpresswayTripQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 5229377941665966888L;

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
	 * 路网侧扣款行程单号： 1、需要与真实的扣款行程对应 2、路网侧全国车牌付场景下唯一
	 */
	@ApiField("out_trip_id")
	private String outTripId;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
