package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权添加
 *
 * @author auto create
 * @since 1.0, 2022-03-17 14:03:56
 */
public class AlipayCommerceOperationTimescardAuthorityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1236975958562894322L;

	/**
	 * 场景码固定值HARDRESSING
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
