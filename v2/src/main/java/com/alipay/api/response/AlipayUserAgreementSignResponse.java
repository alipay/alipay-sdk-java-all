package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:31:53
 */
public class AlipayUserAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6897658871547978795L;

	/** 
	 * 在无需用户确认且签约成功的场景下，会同步返回签约协议号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 签约申请成功的场景下，会同步返回用户签约的支付宝账号对应的支付宝唯一用户id。
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/** 
	 * 签约申请成功的场景下，会同步返回用户签约的支付宝账号对应的支付宝唯一用户id。
以2088开头的16位纯数字组成。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 签约申请token，其格式和内容，由支付宝定义。在需要签约确认的场景下，商户可根据申请操作成功时返回的申请token，进行后续的确认操作。
1. 不需要用户进行签约确认时，不返回本参数。
2. 需要用户进行签约确认时，本参数不为空。
	 */
	@ApiField("apply_token")
	private String applyToken;

	/** 
	 * 用户在商户网站的登录账号，如果商户接口中未传，则不会返回
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 是否海外购汇身份
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getAlipayOpenId( ) {
		return this.alipayOpenId;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setApplyToken(String applyToken) {
		this.applyToken = applyToken;
	}
	public String getApplyToken( ) {
		return this.applyToken;
	}

	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}
	public String getExternalLogonId( ) {
		return this.externalLogonId;
	}

	public void setForexEligible(String forexEligible) {
		this.forexEligible = forexEligible;
	}
	public String getForexEligible( ) {
		return this.forexEligible;
	}

}
