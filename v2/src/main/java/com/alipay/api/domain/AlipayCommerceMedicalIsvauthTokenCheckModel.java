package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取授权校验结果
 *
 * @author auto create
 * @since 1.0, 2026-07-09 12:42:50
 */
public class AlipayCommerceMedicalIsvauthTokenCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2116565212966321399L;

	/**
	 * 授权码，返回当前授权的有效性。
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1:Auth有效性判定，
非枚举类型。
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
