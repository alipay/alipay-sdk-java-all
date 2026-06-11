package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付代扣签约状态查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 14:58:01
 */
public class AlipayCommerceTransportExpresswaySignQuerystatusModel extends AlipayObject {

	private static final long serialVersionUID = 2439795561158429644L;

	/**
	 * 支付宝车牌付代扣协议号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 调用方标识ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部协议单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

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

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
