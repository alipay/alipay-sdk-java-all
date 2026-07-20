package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询办事保险箱用户数据
 *
 * @author auto create
 * @since 1.0, 2026-06-16 13:47:56
 */
public class AlipayEbppIndustryTreasurechestDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2249794493883272863L;

	/**
	 * 用户授权后办事保险箱生成的授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 在市民中心办事保险箱注册的授权场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 支付宝用户的userId
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
