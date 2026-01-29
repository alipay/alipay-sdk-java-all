package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请出行行业订单授权Token
 *
 * @author auto create
 * @since 1.0, 2025-11-13 11:17:41
 */
public class AlipayCommerceTransportOrderauthTokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7652529937372982293L;

	/**
	 * 16位支付宝小程序应用APPID，默认是当前调用方
	 */
	@ApiField("auth_appid")
	private String authAppid;

	/**
	 * 授权行业编码，由支付宝业务人员分配
	 */
	@ApiField("auth_industry")
	private String authIndustry;

	/**
	 * 额外参数
	 */
	@ApiField("ext_info")
	private AuthTokenApplyExtInfo extInfo;

	/**
	 * 身份证号码
	 */
	@ApiField("id_card_number")
	private String idCardNumber;

	/**
	 * 支付宝用户唯一开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机号码
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 支付宝用户唯一开放ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户信息来源
	 */
	@ApiField("user_info_source")
	private String userInfoSource;

	public String getAuthAppid() {
		return this.authAppid;
	}
	public void setAuthAppid(String authAppid) {
		this.authAppid = authAppid;
	}

	public String getAuthIndustry() {
		return this.authIndustry;
	}
	public void setAuthIndustry(String authIndustry) {
		this.authIndustry = authIndustry;
	}

	public AuthTokenApplyExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(AuthTokenApplyExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserInfoSource() {
		return this.userInfoSource;
	}
	public void setUserInfoSource(String userInfoSource) {
		this.userInfoSource = userInfoSource;
	}

}
