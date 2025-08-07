package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.taobao.bind.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 15:43:47
 */
public class AlipayUserAccountTaobaoBindQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3741678556937112847L;

	/** 
	 * 支付宝用户设置的头像
	 */
	@ApiField("avatar")
	private String avatar;

	/** 
	 * 支付宝账号绑定的邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 用户是否已认证
	 */
	@ApiField("is_certified")
	private String isCertified;

	/** 
	 * 支付宝绑定的手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/** 
	 * 用户设置的支付宝昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户的账号类型，个人还是企业
	 */
	@ApiField("user_type")
	private String userType;

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatar( ) {
		return this.avatar;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}
	public String getIsCertified( ) {
		return this.isCertified;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileNo( ) {
		return this.mobileNo;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getNickName( ) {
		return this.nickName;
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

	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserType( ) {
		return this.userType;
	}

}
