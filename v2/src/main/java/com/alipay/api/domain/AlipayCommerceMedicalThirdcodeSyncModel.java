package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步三方应用的授权码
 *
 * @author auto create
 * @since 1.0, 2025-11-05 18:07:41
 */
public class AlipayCommerceMedicalThirdcodeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5871762184724527121L;

	/**
	 * 授权数据类型，默认全部
	 */
	@ApiField("auth_data_scope")
	private String authDataScope;

	/**
	 * 授权数据可获取的最早时间
	 */
	@ApiField("auth_data_valid_from")
	private Date authDataValidFrom;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 三方平台的应用ID
	 */
	@ApiField("third_app_id")
	private String thirdAppId;

	/**
	 * 三方平台的用户授权码
	 */
	@ApiField("third_auth_code")
	private String thirdAuthCode;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthDataScope() {
		return this.authDataScope;
	}
	public void setAuthDataScope(String authDataScope) {
		this.authDataScope = authDataScope;
	}

	public Date getAuthDataValidFrom() {
		return this.authDataValidFrom;
	}
	public void setAuthDataValidFrom(Date authDataValidFrom) {
		this.authDataValidFrom = authDataValidFrom;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getThirdAppId() {
		return this.thirdAppId;
	}
	public void setThirdAppId(String thirdAppId) {
		this.thirdAppId = thirdAppId;
	}

	public String getThirdAuthCode() {
		return this.thirdAuthCode;
	}
	public void setThirdAuthCode(String thirdAuthCode) {
		this.thirdAuthCode = thirdAuthCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
