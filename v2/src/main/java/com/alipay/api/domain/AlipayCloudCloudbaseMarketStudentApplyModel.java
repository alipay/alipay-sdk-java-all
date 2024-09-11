package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生身份认证
 *
 * @author auto create
 * @since 1.0, 2023-12-26 19:54:17
 */
public class AlipayCloudCloudbaseMarketStudentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4495342237559471584L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 授权码，用于兑换 access_token 进行单次核验
	 */
	@ApiField("app_auth_code")
	private String appAuthCode;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 用于搭配 access_token 进行单次核验
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAppAuthCode() {
		return this.appAuthCode;
	}
	public void setAppAuthCode(String appAuthCode) {
		this.appAuthCode = appAuthCode;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
