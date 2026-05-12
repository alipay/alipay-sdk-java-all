package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账场景申报信息
 *
 * @author auto create
 * @since 1.0, 2026-04-13 10:57:35
 */
public class SceneApplyRecord extends AlipayObject {

	private static final long serialVersionUID = 4729399916994815546L;

	/**
	 * 生效时间 格式 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effective_time")
	private String effectiveTime;

	/**
	 * 场景名称信息
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 场景状态
	 */
	@ApiField("scene_status")
	private String sceneStatus;

	public String getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getSceneStatus() {
		return this.sceneStatus;
	}
	public void setSceneStatus(String sceneStatus) {
		this.sceneStatus = sceneStatus;
	}

}
