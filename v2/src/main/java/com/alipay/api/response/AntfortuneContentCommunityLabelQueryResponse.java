package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.label.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:49:09
 */
public class AntfortuneContentCommunityLabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8149226497387286484L;

	/** 
	 * groupKey：标签组key groupName 标签组名字
	 */
	@ApiField("label_group_list")
	private String labelGroupList;

	/** 
	 * 场景key
	 */
	@ApiField("scene_key")
	private String sceneKey;

	/** 
	 * 场景名字
	 */
	@ApiField("scene_name")
	private String sceneName;

	public void setLabelGroupList(String labelGroupList) {
		this.labelGroupList = labelGroupList;
	}
	public String getLabelGroupList( ) {
		return this.labelGroupList;
	}

	public void setSceneKey(String sceneKey) {
		this.sceneKey = sceneKey;
	}
	public String getSceneKey( ) {
		return this.sceneKey;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public String getSceneName( ) {
		return this.sceneName;
	}

}
