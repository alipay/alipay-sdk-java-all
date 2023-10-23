package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.zmgo.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:11:50
 */
public class ZhimaCreditPeZmgoAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3317572166537184551L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号，即花芝轻会员协议号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 协议名称
	 */
	@ApiField("agreement_name")
	private String agreementName;

	/** 
	 * 协议状态。Y表示状态有效，P表示状态失效中，N表示状态已失效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 代表签约芝麻GO所属业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 支付宝用户userId
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 该条芝麻GO协议签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/** 
	 * 该芝麻GO协议开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAgreementName(String agreementName) {
		this.agreementName = agreementName;
	}
	public String getAgreementName( ) {
		return this.agreementName;
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

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	public Date getSignTime( ) {
		return this.signTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

}
