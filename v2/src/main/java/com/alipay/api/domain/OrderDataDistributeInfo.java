package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分发结果信息
 *
 * @author auto create
 * @since 1.0, 2023-06-30 15:00:38
 */
public class OrderDataDistributeInfo extends AlipayObject {

	private static final long serialVersionUID = 2683441446975446349L;

	/**
	 * 未分发到场景的具体原因。开发者可根据具体原因定位解决问题后发起重试。
	 */
	@ApiField("not_distribute_reason")
	private String notDistributeReason;

	/**
	 * 分发场景code。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 分发场景名，对应scene_code。
	 */
	@ApiField("scene_name")
	private String sceneName;

	public String getNotDistributeReason() {
		return this.notDistributeReason;
	}
	public void setNotDistributeReason(String notDistributeReason) {
		this.notDistributeReason = notDistributeReason;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
