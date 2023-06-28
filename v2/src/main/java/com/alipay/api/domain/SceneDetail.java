package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台场景详情信息
 *
 * @author auto create
 * @since 1.0, 2017-10-30 10:40:49
 */
public class SceneDetail extends AlipayObject {

	private static final long serialVersionUID = 8186194665424318338L;

	/**
	 * 场景描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 场景配置的图片
	 */
	@ApiField("scene_image")
	private String sceneImage;

	/**
	 * 小蚂答场景标题
	 */
	@ApiField("title")
	private String title;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneImage() {
		return this.sceneImage;
	}
	public void setSceneImage(String sceneImage) {
		this.sceneImage = sceneImage;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
