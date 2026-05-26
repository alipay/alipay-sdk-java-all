package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AMPE场景信息
 *
 * @author auto create
 * @since 1.0, 2021-09-16 20:32:52
 */
public class AmpeSceneInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3264412142476734939L;

	/**
	 * 场景id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 场景的中文描述
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
