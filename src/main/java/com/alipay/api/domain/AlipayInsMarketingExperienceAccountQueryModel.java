package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 寿险体验金账户查询
 *
 * @author auto create
 * @since 1.0, 2019-06-25 17:22:36
 */
public class AlipayInsMarketingExperienceAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4769445242435498211L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户2088
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
