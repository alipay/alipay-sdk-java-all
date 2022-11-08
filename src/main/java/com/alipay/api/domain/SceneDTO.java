package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-27 09:50:43
 */
public class SceneDTO extends AlipayObject {

	private static final long serialVersionUID = 8236267966426872483L;

	/**
	 * 场景编码+唯一+场景列表查询
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景名称+不唯一+场景列表查询
	 */
	@ApiField("scene_name")
	private String sceneName;

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
