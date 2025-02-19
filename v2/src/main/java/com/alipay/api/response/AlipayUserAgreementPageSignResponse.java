package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.page.sign response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 15:52:20
 */
public class AlipayUserAgreementPageSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 1699185435593314815L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。（只有签约成功时才会返回）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 返回脱敏的支付宝账号。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
(只有签约成功时才会返回)
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。(只有签约成功时才会返回)
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 授信模式
	 */
	@ApiField("credit_auth_mode")
	private String creditAuthMode;

	/** 
	 * 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/** 
	 * 用户在商户网站的登录账号，如果商户接口中未传，则不会返回
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/** 
	 * 是否海外购汇身份。值：T/F（只有在签约成功时才会返回）
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

	/** 
	 * 用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("invalid_time")
	private String invalidTime;

	/** 
	 * 用于跳转支付宝页面的信息，POST和GET方法生成内容不同：使用POST方法执行，结果为html form表单，在浏览器渲染即可；使用GET方法会得到支付宝URL，需要打开或重定向到该URL。建议使用POST方式。
	 */
	@ApiField("pageRedirectionData")
	private String pageRedirectionData;

	/** 
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 当前签约的协议场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/** 
	 * 支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss。(只有签约成功才会返回)
	 */
	@ApiField("sign_time")
	private String signTime;

	/** 
	 * 用户选择的首扣渠道列表。其中list元素是一个map，包含tail - 银行卡尾号、bank_card_type - 银行卡类型。
	 */
	@ApiField("specified_sort_assets")
	private String specifiedSortAssets;

	/** 
	 * 协议的当前状态。
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停。  
（只有签约成功才会返回）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss。（只有签约成功才会返回）
	 */
	@ApiField("valid_time")
	private String validTime;

	/** 
	 * 用户的芝麻信用openId，供商户查询用户芝麻信用使用。（只有签约成功时才返回）
	 */
	@ApiField("zm_open_id")
	private String zmOpenId;

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

	public void setCreditAuthMode(String creditAuthMode) {
		this.creditAuthMode = creditAuthMode;
	}
	public String getCreditAuthMode( ) {
		return this.creditAuthMode;
	}

	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}
	public String getExternalAgreementNo( ) {
		return this.externalAgreementNo;
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

	public void setInvalidTime(String invalidTime) {
		this.invalidTime = invalidTime;
	}
	public String getInvalidTime( ) {
		return this.invalidTime;
	}

	public void setPageRedirectionData(String pageRedirectionData) {
		this.pageRedirectionData = pageRedirectionData;
	}
	public String getPageRedirectionData( ) {
		return this.pageRedirectionData;
	}

	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}
	public String getPersonalProductCode( ) {
		return this.personalProductCode;
	}

	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}
	public String getSignScene( ) {
		return this.signScene;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getSignTime( ) {
		return this.signTime;
	}

	public void setSpecifiedSortAssets(String specifiedSortAssets) {
		this.specifiedSortAssets = specifiedSortAssets;
	}
	public String getSpecifiedSortAssets( ) {
		return this.specifiedSortAssets;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setValidTime(String validTime) {
		this.validTime = validTime;
	}
	public String getValidTime( ) {
		return this.validTime;
	}

	public void setZmOpenId(String zmOpenId) {
		this.zmOpenId = zmOpenId;
	}
	public String getZmOpenId( ) {
		return this.zmOpenId;
	}

}
