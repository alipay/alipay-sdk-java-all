package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 17:02:32
 */
public class AlipayTradeCreditAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4113188537964347232L;

	/** 
	 * 先采协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 标识协议状态
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 签约该协议的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 标识协议签约的时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	public Date getBizTime( ) {
		return this.bizTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

}
