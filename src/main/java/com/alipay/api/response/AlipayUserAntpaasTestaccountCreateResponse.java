package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.testaccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:18
 */
public class AlipayUserAntpaasTestaccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7518893322654126964L;

	/** 
	 * 认证等级，L1 L2 L3
	 */
	@ApiField("account_level")
	private String accountLevel;

	/** 
	 * 证件中的姓名，必须为中文，尽量不要超过6个汉字
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，IDENTITY_CARD 身份证，PASSPORT 护照，HK_MC_CARD 港澳证件
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * havanaId
	 */
	@ApiField("havana_id")
	private String havanaId;

	/** 
	 * abc123@alitest.com
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 登录名类型，EMAIL,MOBILE
	 */
	@ApiField("logon_type")
	private String logonType;

	/** 
	 * message，错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 支付密码
	 */
	@ApiField("payment_password")
	private String paymentPassword;

	/** 
	 * 登录密码
	 */
	@ApiField("query_password")
	private String queryPassword;

	/** 
	 * success，返回结果,T,F
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 新创建的账户id，accountNo
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 账户状态，T,Q
	 */
	@ApiField("user_status")
	private String userStatus;

	/** 
	 * 账户类型，个人企业 PERSON ORG
	 */
	@ApiField("user_type")
	private String userType;

	public void setAccountLevel(String accountLevel) {
		this.accountLevel = accountLevel;
	}
	public String getAccountLevel( ) {
		return this.accountLevel;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}
	public String getHavanaId( ) {
		return this.havanaId;
	}

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
	}

	public void setLogonType(String logonType) {
		this.logonType = logonType;
	}
	public String getLogonType( ) {
		return this.logonType;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setPaymentPassword(String paymentPassword) {
		this.paymentPassword = paymentPassword;
	}
	public String getPaymentPassword( ) {
		return this.paymentPassword;
	}

	public void setQueryPassword(String queryPassword) {
		this.queryPassword = queryPassword;
	}
	public String getQueryPassword( ) {
		return this.queryPassword;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserStatus( ) {
		return this.userStatus;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType( ) {
		return this.userType;
	}

}
