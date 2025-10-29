package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发测试用例执行
 *
 * @author auto create
 * @since 1.0, 2024-01-09 13:58:30
 */
public class AlipayEngineeringInfrastructureAnttestopsTestcaseTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 6347257175649822891L;

	/**
	 * 操作者阿里花名，若是外包：张三(WB123)
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 执行环境
	 */
	@ApiField("env_enum")
	private String envEnum;

	/**
	 * 来源应用英文名-aone查看
	 */
	@ApiField("original_system")
	private String originalSystem;

	/**
	 * 场景数据
	 */
	@ApiField("scene_data")
	private SceneData sceneData;

	/**
	 * 场景数据ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 联调分组
	 */
	@ApiField("sofa_group")
	private String sofaGroup;

	/**
	 * 用例ID，蚂蚁业务侧对外提供
	 */
	@ApiField("test_case_id")
	private String testCaseId;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getEnvEnum() {
		return this.envEnum;
	}
	public void setEnvEnum(String envEnum) {
		this.envEnum = envEnum;
	}

	public String getOriginalSystem() {
		return this.originalSystem;
	}
	public void setOriginalSystem(String originalSystem) {
		this.originalSystem = originalSystem;
	}

	public SceneData getSceneData() {
		return this.sceneData;
	}
	public void setSceneData(SceneData sceneData) {
		this.sceneData = sceneData;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSofaGroup() {
		return this.sofaGroup;
	}
	public void setSofaGroup(String sofaGroup) {
		this.sofaGroup = sofaGroup;
	}

	public String getTestCaseId() {
		return this.testCaseId;
	}
	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

}
