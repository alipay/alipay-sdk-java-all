package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭共享准入预咨询
 *
 * @author auto create
 * @since 1.0, 2023-01-03 10:55:52
 */
public class AlipayUserFamilyShareAdmittancePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4857123775153984456L;

	/**
	 * 共享资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 标识共享业务接入我的家场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
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
