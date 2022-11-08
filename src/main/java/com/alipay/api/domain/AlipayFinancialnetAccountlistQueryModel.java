package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询账户信息列表
 *
 * @author auto create
 * @since 1.0, 2022-02-25 14:40:36
 */
public class AlipayFinancialnetAccountlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4656164834999582513L;

	/**
	 * 签约产品ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
