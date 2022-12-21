package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ampe场景信息
 *
 * @author auto create
 * @since 1.0, 2021-09-22 14:01:22
 */
public class AmpeSceneResponse extends AlipayObject {

	private static final long serialVersionUID = 2154268845666483843L;

	/**
	 * 场景id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
