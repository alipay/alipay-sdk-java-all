package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-26 18:13:43
 */
public class AlipayOverseasTaxUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1423811214234623921L;

	/** 
	 * 用户状态是否合法，比如是否进行了实名认证，true为合法，false为非法。
	 */
	@ApiField("is_eligible")
	private Boolean isEligible;

	/** 
	 * 用户状态非法，给商户的提示信息。
	 */
	@ApiField("is_eligible_msg")
	private String isEligibleMsg;

	/** 
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

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

	public void setIsEligible(Boolean isEligible) {
		this.isEligible = isEligible;
	}
	public Boolean getIsEligible( ) {
		return this.isEligible;
	}

	public void setIsEligibleMsg(String isEligibleMsg) {
		this.isEligibleMsg = isEligibleMsg;
	}
	public String getIsEligibleMsg( ) {
		return this.isEligibleMsg;
	}

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
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
