package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询两个用户的某个资源的共享关系
 *
 * @author auto create
 * @since 1.0, 2021-11-30 14:30:23
 */
public class AlipayUserFamilyShareAuthCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1787418931677628723L;

	/**
	 * 共享授权的资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 共享授权组件的被分享人的业务用户ID
	 */
	@ApiField("target_biz_user_id")
	private String targetBizUserId;

	/**
	 * 被分享人的业务用户id，目前支持三种账号来源，ALIPAY：支付宝用户id，HAVANA：集团集团havanaId，ARCHIVE：关系平台档案id
	 */
	@ApiField("target_user_biz_source")
	private String targetUserBizSource;

	/**
	 * 共享授权组件的分享人的支付宝用户ID
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

	public String getTargetBizUserId() {
		return this.targetBizUserId;
	}
	public void setTargetBizUserId(String targetBizUserId) {
		this.targetBizUserId = targetBizUserId;
	}

	public String getTargetUserBizSource() {
		return this.targetUserBizSource;
	}
	public void setTargetUserBizSource(String targetUserBizSource) {
		this.targetUserBizSource = targetUserBizSource;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
