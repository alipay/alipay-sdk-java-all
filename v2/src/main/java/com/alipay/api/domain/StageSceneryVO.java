package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人场景布景信息
 *
 * @author auto create
 * @since 1.0, 2023-08-24 23:09:00
 */
public class StageSceneryVO extends AlipayObject {

	private static final long serialVersionUID = 2824462698254918559L;

	/**
	 * 布景预览图信息
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 布景id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 布景模型的url信息
	 */
	@ApiField("scenery_gltf_url")
	private String sceneryGltfUrl;

	/**
	 * 布景名称信息
	 */
	@ApiField("scenery_name")
	private String sceneryName;

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSceneryGltfUrl() {
		return this.sceneryGltfUrl;
	}
	public void setSceneryGltfUrl(String sceneryGltfUrl) {
		this.sceneryGltfUrl = sceneryGltfUrl;
	}

	public String getSceneryName() {
		return this.sceneryName;
	}
	public void setSceneryName(String sceneryName) {
		this.sceneryName = sceneryName;
	}

}
