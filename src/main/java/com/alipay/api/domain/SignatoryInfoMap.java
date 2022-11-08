package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SignatoryInfo信息的查询结果
 *
 * @author auto create
 * @since 1.0, 2022-05-09 15:02:56
 */
public class SignatoryInfoMap extends AlipayObject {

	private static final long serialVersionUID = 8436373653534488417L;

	/**
	 * 脱敏展示名，用于app展示
	 */
	@ApiField("app_desens_display_name")
	private String appDesensDisplayName;

	/**
	 * 用户头像路径
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 用户绑定手机
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 【证件号码】结合证件类型使用.【注意】只is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * email登录名
	 */
	@ApiField("email")
	private String email;

	/**
	 * 是否通过实名认证。T/F
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 支付宝登录名
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 若用户是个人用户，则是用户的真实姓名；若是企业用户，则是企业名称。【注意】只有is_certified为T的时候才有意义，否则不保证准确性.
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户类型（1/2） 1代表公司账户2代表个人账户
	 */
	@ApiField("user_type")
	private String userType;

	public String getAppDesensDisplayName() {
		return this.appDesensDisplayName;
	}
	public void setAppDesensDisplayName(String appDesensDisplayName) {
		this.appDesensDisplayName = appDesensDisplayName;
	}

	public String getAvatar() {
		return this.avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBindedMobile() {
		return this.bindedMobile;
	}
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsCertified() {
		return this.isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getNickName() {
		return this.nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
