package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权添加
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:30:29
 */
public class AlipayCommerceOperationTimescardAuthorityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6488393921562821991L;

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
