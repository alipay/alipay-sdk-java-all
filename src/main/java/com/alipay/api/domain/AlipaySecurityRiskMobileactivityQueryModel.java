package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户风险评级客户绑定手机活跃度服务
 *
 * @author auto create
 * @since 1.0, 2016-06-15 13:55:46
 */
public class AlipaySecurityRiskMobileactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4414588332289265986L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("mobile")
	private String mobile;

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
