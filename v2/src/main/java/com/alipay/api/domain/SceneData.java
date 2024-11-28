package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用例执行场景数据
 *
 * @author auto create
 * @since 1.0, 2024-01-09 11:54:17
 */
public class SceneData extends AlipayObject {

	private static final long serialVersionUID = 8617346112588797358L;

	/**
	 * 该场景数据执行的环境
	 */
	@ApiField("execute_env")
	private String executeEnv;

	/**
	 * 场景明细数据
	 */
	@ApiListField("scene_data")
	@ApiField("scene_data_unit")
	private List<SceneDataUnit> sceneData;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	public String getExecuteEnv() {
		return this.executeEnv;
	}
	public void setExecuteEnv(String executeEnv) {
		this.executeEnv = executeEnv;
	}

	public List<SceneDataUnit> getSceneData() {
		return this.sceneData;
	}
	public void setSceneData(List<SceneDataUnit> sceneData) {
		this.sceneData = sceneData;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
