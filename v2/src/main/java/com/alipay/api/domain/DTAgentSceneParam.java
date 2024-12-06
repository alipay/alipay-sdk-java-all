package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务场景参数
 *
 * @author auto create
 * @since 1.0, 2024-11-05 17:25:41
 */
public class DTAgentSceneParam extends AlipayObject {

	private static final long serialVersionUID = 2599984419328895791L;

	/**
	 * 场景业务参数
	 */
	@ApiField("scene_ext_info")
	private DTAgentExtInfo sceneExtInfo;

	/**
	 * 可选值，为当前页面产品名称，用于算法workflow提升精度
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 场景用户id，标识同一个用户提问的问题，可用于提升回答准确度
	 */
	@ApiField("scene_user_id")
	private String sceneUserId;

	public DTAgentExtInfo getSceneExtInfo() {
		return this.sceneExtInfo;
	}
	public void setSceneExtInfo(DTAgentExtInfo sceneExtInfo) {
		this.sceneExtInfo = sceneExtInfo;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getSceneUserId() {
		return this.sceneUserId;
	}
	public void setSceneUserId(String sceneUserId) {
		this.sceneUserId = sceneUserId;
	}

}
