package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.info.taobao.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-19 11:16:41
 */
public class AlipayUserAccountInfoTaobaoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1787577599654485589L;

	/** 
	 * alipay_user_id+是+手淘端内绑定支付宝账号+无+token获取+无
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 用户是否完成认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * 脱敏支付宝外标+是+手淘端内绑定支付宝账号+无+token获取+无
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsCertified( ) {
		return this.isCertified;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType( ) {
		return this.userType;
	}

}
