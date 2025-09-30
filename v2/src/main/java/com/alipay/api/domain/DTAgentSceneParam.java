package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务场景参数
 *
 * @author auto create
 * @since 1.0, 2024-12-17 18:33:51
 */
public class DTAgentSceneParam extends AlipayObject {

	private static final long serialVersionUID = 3849634124811615539L;

	/**
	 * 自定义业务参数
	 */
	@ApiListField("scene_biz_args")
	@ApiField("d_t_agent_ext_info")
	private List<DTAgentExtInfo> sceneBizArgs;

	/**
	 * 场景业务参数 当前字段已废弃(该参数在下游已废弃使用)
	 */
	@ApiField("scene_ext_info")
	@Deprecated
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

	public List<DTAgentExtInfo> getSceneBizArgs() {
		return this.sceneBizArgs;
	}
	public void setSceneBizArgs(List<DTAgentExtInfo> sceneBizArgs) {
		this.sceneBizArgs = sceneBizArgs;
	}

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
