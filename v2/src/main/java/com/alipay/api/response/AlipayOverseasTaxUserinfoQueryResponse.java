package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTaxUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4241772293734115129L;

	/** 
	 * 用户是否符合支付宝退税资金收款条件。包括用户状态，认证状态等的校验。true为符合支付宝退税资金收款条件，false为不符合
	 */
	@ApiField("eligible")
	private Boolean eligible;

	/** 
	 * 用户状态非法，只有eligible为false时才有意义。
类型有：
REAL_NAME_UNCERTIFIED，根据机构需求，可以提示用户稍后进行实名认证，然后继续流程，或者拒绝用户继续操作。
ILLEGAL_USER，非法用户，终结流程。
USER_ACCOUNT_FREEZED，用户已被冻结，终结流程。
	 */
	@ApiField("eligible_msg")
	private String eligibleMsg;

	/** 
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户Id:蚂蚁统一会员ID,唯一
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户姓名:用户真实名称
	 */
	@ApiField("user_name")
	private String userName;

	public void setEligible(Boolean eligible) {
		this.eligible = eligible;
	}
	public Boolean getEligible( ) {
		return this.eligible;
	}

	public void setEligibleMsg(String eligibleMsg) {
		this.eligibleMsg = eligibleMsg;
	}
	public String getEligibleMsg( ) {
		return this.eligibleMsg;
	}

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
