package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.zhima.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 11:07:57
 */
public class AlipayCommerceTransportChargerZhimaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6372286268838229547L;

	/** 
	 * 开通/授权状态，VALID: 有效，INVALID: 无效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 如果是签约状态，返回签约时间；如果未签约，返回本次操作时间。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/** 
	 * 芝麻开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 商户外部协议号，需要全局唯一。
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/** 
	 * 芝麻开通插件地址，用于跳转芝麻先充后付签约
	 */
	@ApiField("plugin_url")
	private String pluginUrl;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	public Date getBizTime( ) {
		return this.bizTime;
	}

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
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

	public void setPluginUrl(String pluginUrl) {
		this.pluginUrl = pluginUrl;
	}
	public String getPluginUrl( ) {
		return this.pluginUrl;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
