package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询景点信息详情
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class AlipayCloudCloudpromoScenicInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3446782456461666244L;

	/**
	 * 租户ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 场景ID
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 景点id
	 */
	@ApiField("scenic_id")
	private String scenicId;

	/**
	 * 景点名称
	 */
	@ApiField("title")
	private String title;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getScenicId() {
		return this.scenicId;
	}
	public void setScenicId(String scenicId) {
		this.scenicId = scenicId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
