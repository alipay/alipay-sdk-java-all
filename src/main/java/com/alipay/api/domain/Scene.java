package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗创建带参二维码接口，场景信息
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:27:01
 */
public class Scene extends AlipayObject {

	private static final long serialVersionUID = 4665184561922919352L;

	/**
	 * 场景Id，最长32位，英文字母、数字以及下划线，开发者自定义
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
