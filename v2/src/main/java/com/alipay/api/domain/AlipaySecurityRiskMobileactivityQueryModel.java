package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户风险评级客户绑定手机活跃度服务
 *
 * @author auto create
 * @since 1.0, 2022-12-28 20:44:16
 */
public class AlipaySecurityRiskMobileactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7232617884434382633L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝userId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景名称
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
